# coding: utf-8
# Here your code !
n = int(raw_input())
S = map(int,raw_input().split())
q = int(raw_input())
T = map(int,raw_input().split())
C = 0

def binary_search(A,n):
    l = len(A)
    if l==0:
        return False
    elif A[l/2] > n: 
        return binary_search(A[:l/2],n)
    elif A[l/2] == n:
        return True
    elif A[l/2]<n:
        return binary_search(A[(l/2)+1:],n)

for item in T:
    if binary_search(S,item):
        C += 1
print C