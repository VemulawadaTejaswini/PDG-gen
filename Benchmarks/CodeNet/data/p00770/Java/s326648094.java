#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
using namespace std;

#define REP(i,n) for(int i = 0;i < (n);i++)
#define FOR(i,a,n) for(int i = (a);i < (n);i++)
const int MAX_E = 1e3 + 3;
const int START = MAX_E / 2;
const int N = 1e6 + 3;
const int INF = 1e9;
int p[N+1];
void e(){
  fill(p,p+N,1);
  p[0] = p[1] = 0;
  for(int i = 2;i*i<=N;i++)
    if(p[i] == 1)for(int j = i*i;j<=N;j+=i)p[j] = 0;
}

map<pair<int,int> ,int> mp;

inline pair<int,int> pmax(pair<int,int> a, pair<int,int> b,int x,int y){
  // a is pre
  if(p[mp[make_pair(x,y)]]){
    a.first++;
    b.second = mp[make_pair(x,y)];
    a.second = mp[make_pair(x,y)];
    if(a.first > b.first)return a;
    else return b;
  }else{
    if(a.first > b.first)return a;
    else return b;
  }
}

int main(){
  int n,m;

  int dx[4] = {1,0,-1,0};
  int dy[4] = {0,-1,0,1};
  e();
  pair<int,int> co[MAX_E][MAX_E];// n, is prime
  pair<int,int> dp[MAX_E][MAX_E];// first is num, second is prime
  int rx =START,lx = START,uy = START,ly = START;
  int x = START,y = START,mode = 0;
  FOR(i,1,N){
    mp[make_pair(x,y)] = i;
    x += dx[mode];
      y += dy[mode];
      if(mode == 0 && x > rx){rx = x;mode++;}
      if(mode == 1 && y > uy){uy = y;mode++;}
      if(mode == 2 && x < lx){lx = x;mode++;}
      if(mode == 3 && y < ly){ly = y;mode++;}
  }


  
  while(cin>>n>>m,n){
    int rx =START,lx = START,uy = START,ly = START;

    int x = START,y = START,mode = 0;
    int sx,sy;
    fill(co[0],co[MAX_E],make_pair(INF,0));
    FOR(i,1,n+1){
      if(i == m){//get start
      sx = x,sy = y;
      }

      co[MAX_E/2 + x][MAX_E/2 + y] = make_pair(i,p[i]);
      x += dx[mode];
      y += dy[mode];
      if(mode == 0 && x > rx){rx = x;mode++;}
      if(mode == 1 && y > uy){uy = y;mode++;}
      if(mode == 2 && x < lx){lx = x;mode++;}
      if(mode == 3 && y < ly){ly = y;mode++;}
    }

    int prelx = x,prerx = x;
    int nowlx = x,nowrx = x;
    sy--;
    for(;sy >= ly;sy--){
      if(co[nowlx][nowrx].first != INF)nowlx--;
      if(co[nowrx][nowrx].first != INF)nowrx++;
      for(int i  = nowlx; i <= nowrx;i++){
        if(i < prerx) dp[i][sy] = pmax(dp[i][sy],dp[i][sy],i,sy);
        if(i <= prerx && i >= prelx)dp[i][sy] = pmax(dp[i][sy+1], dp[i][sy],i,sy);
        if(i > prelx)dp[i][sy] = pmax(dp[i-1][sy+1], dp[i][sy],i,sy);
      }
      prelx = nowlx;
      prerx = nowrx;
    }
    pair<int,int> ans = make_pair(0,0);

    rx =START,lx = START,uy = START,ly = START;
    x = START,y = START,mode = 0;
    FOR(i,1,n+1){
      if(dp[x][y].first > ans.first)ans = dp[x][y];
      if(dp[x][y].first == ans.first && dp[x][y].second > ans.second)ans = dp[x][y];
    x += dx[mode];
      y += dy[mode];
      if(mode == 0 && x > rx){rx = x;mode++;}
      if(mode == 1 && y > uy){uy = y;mode++;}
      if(mode == 2 && x < lx){lx = x;mode++;}
      if(mode == 3 && y < ly){ly = y;mode++;}
    }
    cout << ans.first << ' ' << ans.second << endl;
  }
}