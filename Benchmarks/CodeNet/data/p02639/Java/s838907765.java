import sys

input = sys.stdin.readline

lst = list(map(int, input().split()))

for i in range(len(lst)):
    if lst[i] == 0:
        print(i+1)