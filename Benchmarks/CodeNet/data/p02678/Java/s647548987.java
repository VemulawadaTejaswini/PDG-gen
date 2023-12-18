#include <bits/stdc++.h>
#include <iostream>
using namespace std;
long long n,m;
struct Passages{
    long long x,y;
};
Passages p[200050];
long long ans[200050];
bool b[100500];
int main()
{
    cin>>n>>m;
    queue<long long>q;
    for(int i=2;i<=n;i++)
        b[i] = true;
    int count=1;
    for(int i=0;i<m;i++) {
        scanf("%lld%lld", &p[i].x, &p[i].y);
        if(p[i].x==1) {
            q.push(p[i].y);
            ans[p[i].y]=1;
            b[p[i].y]=false;
            //<<p[i].y<<"  "<<ans[p[i].y]<<endl;
            count++;
        }
        if(p[i].y==1) {
            q.push(p[i].x);
            ans[p[i].x]=1;
            b[p[i].x]=false;
            //cout<<p[i].x<<"  "<<ans[p[i].x]<<endl;
            count++;
        }
    }
    //cout<<count<<endl;
    if(q.empty())
        cout<<"-1";
    else{
        while(!q.empty()){
            long long now=q.front();
            q.pop();
            for(long long i=0;i<m;i++){
                if(p[i].x==now&&b[p[i].y]){
                    ans[p[i].y]=p[i].x;
                    //cout<<p[i].y<<"  "<<ans[p[i].y]<<endl;
                    b[p[i].y]=false;
                    count++;
                    q.push(p[i].y);
                }
                if(p[i].y==now&&b[p[i].x]){
                    ans[p[i].x]=p[i].y;
                    //cout<<p[i].x<<"  "<<ans[p[i].x]<<endl;
                    b[p[i].x]=false;
                    count++;
                    q.push(p[i].x);
                }
            }
        }
        if(count!=n)
            cout<<"No"<<endl;
        else{
            cout<<"Yes"<<endl;
            for(long long i=2;i<=n;i++)
                printf("%lld\n",ans[i]);
        }

    }


    return 0;
}