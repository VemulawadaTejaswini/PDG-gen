import sys;
import heapq

def iterative(i,j):
    q = []
    heapq.heappush(q,(0,i,j,puz))
    global finding

    while len(q):
        items = heapq.heappop(q)
        c_depth = items[0]
        _i = items[1]
        _j = items[2]
        c_puz = items[3]
        if(puzzleCheck(c_puz)):
            finding = 1
            print(c_depth)
            break

        if((c_depth+simpleHS(c_puz)) > depth):
            continue

        if(_i != 0):
            heapq.heappush(q,(c_depth+1,_i-1,_j,swapPuz(c_puz[0:],_i,_j,_i-1,_j)))
        if(_i != 2):
            heapq.heappush(q,(c_depth+1,_i+1,_j,swapPuz(c_puz[0:],_i,_j,_i+1,_j)))
        if(_j != 0):
            heapq.heappush(q,(c_depth+1,_i,_j-1,swapPuz(c_puz[0:],_i,_j,_i,_j-1)))
        if(_j != 2):
            heapq.heappush(q,(c_depth+1,_i,_j+1,swapPuz(c_puz[0:],_i,_j,_i,_j+1)))

def simpleHS(c_puz):
    count = 0
    for i in range(len(correctPuz)):
        if(correctPuz[i] != c_puz[i]):
            count+=1
    return count

def HS(c_puz):
    value = 0
    for i in range(len(c_puz)):
        k = correctPuz.index(c_puz[i])
        _i = (int)(i/3)
        _j = i - _i
        ki = (int)(k/3)
        kj = k - ki
        value = abs(_i-ki)+abs(_j-kj) 

    return value


def swapPuz(c_puz, i, j, i2,j2):
    swap = c_puz[i*3+j]
    c_puz[i*3+j] = c_puz[i2*3+j2]
    c_puz[i2*3+j2] = swap
    return c_puz

def puzzleCheck(c_puz):
    if(c_puz[8] == 0):
        for i in range(len(correctPuz)):
            if(correctPuz[i] != c_puz[i]):
                return False
        return True
    return False

correctPuz = [i+1 for i in range(9)]
correctPuz[8] = 0
puz = [0 for i in range(9)]

i_start = 0
j_start = 0

for i in range(3):
    puz[i*3],puz[i*3+1],puz[i*3+2] = map(int, input().split());
    if(puz[i*3] == 0):
        i_start,j_start = i,0
    elif(puz[i*3+1] == 0):
        i_start,j_start = i,1
    elif(puz[i*3+2] == 0):
        i_start,j_start = i,2

finding = 0
depth = 0
while True:
    if(finding == 1):
        break
    iterative(i_start,j_start)
    depth+=1



