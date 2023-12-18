def lcs(str1,str2):
    c=[[0 for _ in range(1010)] for _ in range(1010)]
    m=len(str1)
    n=len(str2)
    maxl=0
    str1=" "+str1
    str2=" "+str2

    i=1
    j=1
    while(i<=m):
        while(j<=n):
            if(str1[i]==str2[j]):
                c[i][j]=c[i-1][j-1]+1
              #  print(c[i][j])
            else:
                c[i][j]=max(c[i-1][j],c[i][j-1])
            maxl=max(maxl,c[i][j])
            j+=1
        i+=1
        j=0

    return maxl

def main():
    n=int(input())
    i=0
    while(i<n):
        str1=str(input())
        str2=str(input())
        print(int(lcs(str1,str2)))
        i+=1

main()

