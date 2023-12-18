n = int(input())
c = input()
count = 0

while "wr" in c:
    c = c.replace("w", "r", 1)
    c = c.replace("wr", "ww", 1)
    count += 1
print(count)