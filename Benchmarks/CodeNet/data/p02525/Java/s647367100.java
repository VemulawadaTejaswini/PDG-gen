#include<iostream>
#include<stdio.h>
#include<iomanip>
#include<math.h>
using namespace std;
int main()
{
    float n,number,a[1005],j,s,m;
    while(cin>>n &&n)
    {
        m=0;
        for(int i=0 ; i<n ; i++)
        {
            cin>>a[i];
            m+=a[i];
 
 
 
        }
        m=m/n;
        s=0;
        for(int i=0 ; i<n ; i++)
        {
            s+=pow(double(a[i]-m),2)/n;
        }
        cout<<setprecision(8)<<fixed;
        cout<<sqrt(s)<<endl;
 
 
    }
 
 
 
    return 0;
}
 