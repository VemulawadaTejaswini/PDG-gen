#include <iostream>
#include <vector>
#include <math.h>
#include <stdio.h>
#include <algorithm>
#include <string>
#include <map>
#include <queue>
#include <memory.h>
using namespace std;
const int INF = 2 << 27;
#define ll long long
typedef pair<int,int> P;

int p;
int q;
int a;
int n;

int solv(int id, int v[]);
int lcm(int a, int b);
int gcd(int a, int b);

int main() {
  	while(1) {
  			cin >> p >> q >> a >> n;
  			if(p == 0 && q == 0 && a == 0 && n == 0) break;
        int x[8];
  			int ret = solv(0,x);
  			cout << ret << endl;
  	}
}

int solv(int id, int v[]) {
  if(id != 0) {
    int pp = 1;
    int qq = v[0];
    for(int i = 1; i < id; i++) {
      int llcm = lcm(qq,v[i]);
      int ql = llcm / qq;
      qq = llcm;
      pp *= ql;

      int vl = llcm / v[i];
      pp += vl;
    }
    int llcm = lcm(qq,q);
    int ql = llcm / q;
    int ppx = p * ql;

    int qql = llcm / qq;
    pp *= qql;
    if(ppx < pp) return 0;
    if(ppx == pp) return 1;
  }
  if(id >= n) return 0;
  int Max = 1;
  int now = 1;
  for(int i = 0; i < id; i++) {
    now *= v[i];
    Max = max(v[i], Max);
  }
  int ret = 0;
  int HOGE = (int)(a / now) +((a % now == 0)?1:0);
  for(int i = Max; i <= HOGE; i++) {
    v[id] = i;
    ret += solv(id+1,v);
    v[id] = 0;
  }
  return ret;
}
int gcd(int a, int b) {
  if(b > a) {
    return gcd(b,a);
  }
  if(b == 0) return a;
  return gcd(b,a % b);
}
int lcm(int a, int b) {
  return a * b / gcd(a,b);
}