# Edit: 2014/09/25
# Lang: Python3
# Time: 0.xxs
#

if __name__ == "__main__":

    while True:
        d = {}
        n = int(input())
        if not n:
            break  # exit at n=0

        for i in range(n):
            s, p, m = map(int, input().strip("\n").split(" "))
            # s:社員番号, p:価格, m:販売戸数
            # print(s, p, m)

            if s in d:
                d[s] = d[s] + p * m
            else:
                d[s] = p * m

        cnt = 0
        for k, v in d.items():
            if v >= 1000000:
                print(k)
                cnt +=1
        if not cnt:
            print("NA")

        #print(d)