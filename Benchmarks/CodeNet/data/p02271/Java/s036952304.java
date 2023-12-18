def solve(i,m):
	if(m==0):return 1
	if(i>=n):return 0
	res=solve(i+1,m) or solve(i+1, m-int(list[i]))
	return res

n=0
list=[]
q=0
M=0

n=int(input())

i=0
while i<n:
	list.append(input())
	i=i+1

q=int(input())

i=0
while i<q:
	M=int(input())
	if(solve(0,M)): print("yes");
	else: print("no");
	i=i+1
