import collections

def main():
    n = int(input())
    a = list(map(int, input().split()))
    
    cnt = collections.defaultdict(int)
    for var in a:
        cnt[var] += 1
    
    sum_a = sum[a]
    
    q = int(input())
    for _ in range(q):
        b, c = list(map(int, input().split()))
        diff = (c-b) * cnt[b]
        sum_a += diff
        print(sum_a)
        cnt[c] += cnt[b]
        cnt[b] = 0
  
    

if __name__ == '__main__':
    main()