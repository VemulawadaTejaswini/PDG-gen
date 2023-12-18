"""    Arnab Chanda    """

from collections import defaultdict, deque
from itertools import permutations
from sys import stdin,stdout
from bisect import bisect_left, bisect_right
from copy import deepcopy
import heapq

int_input=lambda : int(stdin.readline())
string_input=lambda : stdin.readline().split()
multi_int_input =lambda : map(int, stdin.readline().split())
multi_input = lambda : stdin.readline().split()
list_input=lambda : list(map(int,stdin.readline().split()))
string_list_input=lambda: list(string_input())
MOD = pow(10,9)+7

n, k = multi_int_input()

prices = list_input()

prices.sort()

s = 0
for i in range(k):
    s+=prices[i]

print(s)