#include <bits/stdc++.h>
const int MAX=1e3+10;
const int modn=1e9+7;
typedef long long ll ;
#define int ll
#define endl '\n'
#define cwk     freopen("D:\\workplace\\CLion\\in.in","r",stdin),freopen("D:\\workplace\\CLion\\out.out","w",stdout)
using namespace std;
int h,w,beginx,beginy,endx,endy;
char room[MAX][MAX];
string v;
int dis[MAX][MAX];
bool b[MAX][MAX];
int dir[4][2]={{1,0},{-1,0},{0,1},{0,-1}};
#define CHECK(x,y) (x>=0&&x<h&&y>=0&&y<w)
struct node{
    int x,y;
    node(int x=0,int y=0):x(x),y(y){}
};
void BFS(){
    queue<node>q;
    q.push(node(beginx,beginy));
    b[beginx][beginy]=true;
    node next,start;
    while(!q.empty()){
        start=q.front();
        q.pop();
        bool is=false;
        for(int i=0;i<4;i++){
            next=node(start.x+dir[i][0],start.y+dir[i][1]);
            if(CHECK(next.x,next.y)&&!b[next.x][next.y]&&room[next.x][next.y]=='.'){
                dis[next.x][next.y]=dis[start.x][start.y];
                q.push(next);
                b[next.x][next.y]=true;
                is=true;
            }
        }
        if(is) continue;
        for(int i=-2;i<=2;i++){
            for(int j=-2;j<=2;j++){
                next=node(start.x+i,start.y+j);
                if(CHECK(next.x,next.y)&&!b[next.x][next.y]&&room[next.x][next.y]=='.'){
                    q.push(next);
                    b[next.x][next.y]=true;
                    if(dis[next.x][next.y]==1)
                        dis[next.x][next.y]=dis[start.x][start.y]+1;
                    else dis[next.x][next.y]=min(dis[start.x][start.y]+1,dis[next.x][next.y]);
                    //cout<<start.x<<" "<<start.y<<" "<<next.x<<" "<<next.y<<" "<<dis[next.x][next.y]<<" "<<dis[start.x][start.y]<<"\n";
                }
            }
        }
    }
    //cout<<dis[endx][endy];
    if(dis[endx][endy]!=1)
        cout<<dis[endx][endy]-1;
    else if(b[endx][endy]==false)
        cout<<"-1";
    else cout<<"0";
}
void solve(){
    cin>>h>>w>>beginx>>beginy>>endx>>endy;
    beginx--;beginy--;endy--;endx--;
    for(int i=0;i<h;i++){
        cin>>v;
        for(int j=0;j<w;j++){
            dis[i][j]=1;
            room[i][j]=v[j];
        }
    }
    BFS();
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