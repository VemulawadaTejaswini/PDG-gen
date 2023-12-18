#include <iostream>
#include <cstdio>
#include <algorithm>
#include <cstdlib>
#include <queue>
#include <cstring>
#include <cmath>

#define cl(x) memset(x , 0 , sizeof(x))
typedef long long ll;
using namespace std;
const int N = 100010;
int n,m,k;
int w[N];

int t[N];
int pre[N];

void sol() {
    scanf("%d%d%d",&n,&m,&k);
    for(int i = 1 ; i <= n; ++i) {
        scanf("%d",&w[i]);
    }
    for(int i = 1 ; i <= m ; ++i) {
        scanf("%d",&t[i]);
    }
    int pos = 1;
    pre[1] = 1;
    int sum = 0;
    for(int i = 2; i <= n ; ++i) {
        sum += w[i];
        while(sum > k) {
            pos ++;
            sum -= w[pos];
        }
        pre[i] = pos;
    }
    for(int i = 1 ;i <= n; ++i) {
    	pre[i] --;
    	//pre[i] = max(1 , pre[i]);
    }
    int preid = 0;
    int ans = 0;

	t[0] = 0;
    for(int i = 1 ; i <= m; ++i) {
        int tmp = t[i] - t[i-1] - 1;
        int cur = preid + tmp;

        if(cur >= n ) {
            ans += n - preid;
            break;
        }
        ans += tmp;
        preid = pre[cur];
    }
    printf("%d\n",ans);
}
int main() {
    freopen("input.txt","r",stdin);
    sol();
    return 0;
}