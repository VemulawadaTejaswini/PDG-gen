import string
import sys

DEBUG = False
secret_str = "Atcod3rIsGreat"


def local_str(query : str) -> int:
    import Levenshtein
    return Levenshtein.distance(query , secret_str)


def query_str(query : str) -> int:
    if DEBUG:
        ans = local_str(query)
        return ans
    else:
        print("? " + query)
        ans = int(input())
        if ans == 0:
            print("! " + query)
            sys.exit(0)
        return ans

def guess_length() -> int:
    c = "a"
    a = query_str(c)
    al = query_str(c * a)
    al2 = query_str(c * (a + 1))
    if al >= al2:
        return a + 1
    else:
        return a


def merge(S : str, T : str) -> str:
    t = 0
    d = query_str(T)
    for s in S:
        while t <= len(T):
            l = T[:t]
            r = T[t:]
            d2 =  query_str(l + s + r)
            if d2 < d:
                T = l + s + r
                d = d2
                break
            t += 1
    return T


#secret_str = "xfxxfyyyyzzzyaaaaaaf"
L = guess_length()
chars = []
for c in string.ascii_letters + string.digits:
    cr = c * L
    dist = query_str(cr)
    if L - dist > 0:
        chars.append(c * (L - dist))

while(len(chars) > 1):
    chars.sort(key = lambda x : len(x))
    m = merge(chars[0] , chars[1])
    chars[1] = m
    chars = chars[1:]
print(chars[0])
