while True:
  n=input()
  if n==0: break
  print sum(input() for i in range(n/4))