/* ********************************* JAI SAI RAM ************************************* */
#include<bits/stdc++.h>
using namespace std;
typedef long long int ll;
typedef long double lb;
#define endl "\n"
ll P=1000000007;
ll MAX=1000000000000000000LL;
int main()
{
    ll i,j,k,l,m,n,o,p,q,r,s,t;
    cin>>n;
    ll ans=1;
    ll flag=0;
    for(i=1;i<=n;i++)
    {
        cin>>j;
        if((ans*j)>MAX||(ans*j)<0LL)
        flag=1;
        ans*=j;
        if(ans<0||ans>MAX)
        flag=1;
        if(j==0LL)
        {
            flag=0LL;
            ans=0LL;
        }
    }
    if(flag==1)
    cout<<"-1";
    else 
    cout<<ans;
    return 0;
}
