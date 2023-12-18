import numpy as np
N = int(input())
array = list(map(int,input().split()))
product =  np.prod(array)
if product <= 10**18:
  print(product)
else:
  print(-1)