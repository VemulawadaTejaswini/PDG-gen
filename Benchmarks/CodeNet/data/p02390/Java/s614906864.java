s = int(input())
m = 0
h = 0

if s >= 60:
    m = int(s / 60)
    s = s % 60

if m >= 60:
    h = int(m / 60)
    m = m % 60

print(h,m,s)
