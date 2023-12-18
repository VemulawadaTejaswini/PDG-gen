#include<iostream>
#include<algorithm>
#include<vector>
#include<cstdio>
using namespace std;
int a,n,tp,tq;
 
void rec(int p,int q,int an,int &cnt,int k,int total)
{
  if(total > a)return;
  if(an > n)return;
  if(p*tq > tp*q)return;
  if(((n-an)*q+k*p)*tq < tp*k*q)return;
  if(p == tp && q == tq)
    {
      cnt++;
      return;
    }
 
  for(int i=k;q*i<=a;i++)
    {
      int A = p*i+q,B = q*i;
      if(total*i > a)continue;
      int gcd1 = __gcd(A,B);
      A /= gcd1;
      B /= gcd1; 
      rec(A,B,an+1,cnt,i,total*i);
    }
}
 
int main()
{
 
  while(1)
    {
      scanf("%d %d %d %d",&tp,&tq,&a,&n);
      if(!(tp|tq|a|n))break;
      int gcd1 = __gcd(tp,tq);
      tp /= gcd1;
      tq /= gcd1;
      int theNumber = 0;
      for(int i=1;i<=a;i++)
    {
      if(i > a)continue;
      rec(1,i,1,theNumber,i,i);
    }
      printf("%d\n",theNumber);
    }
  return 0;
}

