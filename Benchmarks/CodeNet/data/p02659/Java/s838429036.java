# ANSHUL GAUTAM
# IIIT-D

from math import *
from copy import *                    # ll = deepcopy(l)
from heapq import *                    # heappush(hp,x)
from string import *                # alpha = ascii_lowercase
from random import *                # l.sort(key=lambda l1:l1[0]-l1[1]) => ex: sort on the basis difference
from bisect import *                # bisect_left(arr,x,start,end)  => start and end parameters are temporary
from sys import stdin                # bisect_left return leftmost position where x should be inserted to keep sorted
from sys import maxsize                # minn = -maxsize
from operator import *                # d = sorted(d.items(), key=itemgetter(1))
from itertools import *				  # pre = [0] + list(accumulate(l))
from collections import Counter        # d = dict(Counter(l))
from collections import defaultdict # d = defaultdict(list)

'''
9990000000000000
9990000000000000
'''

def solve(l):
	a,b = l
	a = int(a)
	p = a*b
	return int(p)

l = list(map(float, stdin.readline().rstrip().split()))
ans = solve(l)
print(ans)

