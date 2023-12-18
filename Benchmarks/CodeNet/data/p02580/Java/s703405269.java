#include <bits/stdc++.h>
const int MAX=3e5+10;
const int modn=1e9+7;
typedef long long ll ;
#define int ll
#define endl '\n'
#define cwk     freopen("D:\\workplace\\CLion\\in.in","r",stdin),freopen("D:\\workplace\\CLion\\out.out","w",stdout)
using namespace std;
int h,w,m;
int x,y,flagx,flagy;
int maxx,maxy;
int ansx[MAX],ansy[MAX];
vector<pair<int,int>>v;
void solve(){
   cin>>h>>w>>m;
   for(int i=1;i<=m;i++){
       cin>>x>>y;
       v.push_back(pair<int,int>(x,y));
       ansx[x]++;
       ansy[y]++;
       if(ansx[x]>maxx){
           maxx=ansx[x];
           flagx=x;
       }
       if(ansy[y]>maxy){
           maxy=ansy[y];
           flagy=y;
       }
   }
   int cnt=0;
   for(int i=0;i<v.size();i++){
       if(v[i].first==flagx||v[i].second==flagy)
           cnt++;
   }
   cout<<cnt;
}
signed main() {
    //ios::sync_with_stdio(false);cin.tie(nullptr);cout.tie(nullptr);
    //cwk;
    int _=1;
    //cin>>_;
    while(_--){
        solve();
    }
    return 0;
}