#include<algorithm>
#include<bitset>
#include<cctype>
#include<cmath>
#include<complex>
#include<cstdio>
#include<cstdlib>
#include<cstring>
#include<functional>
#include<iostream>
#include<istream>
#include<iterator>
#include<list>
#include<map>
#include<numeric>
#include<queue>
#include<set>
#include<sstream>
#include<stack>
#include<strstream>
#include<streambuf>
#include<string>
#include<utility>
#include<vector>
#include<iomanip>
#include<ctime>
using namespace std;
/***************************************************************************************************************************************/
typedef long long int LLI;
typedef unsigned long long int ULLI;
#define IMAX ((unsigned)1<<31)-1
#define eps 1e-11
#define LIMAX (1LL<<63)-1
#define ULIMAX (1LL<<64)-1
#define UIMAX ((LLI)1<<32)-1
#define MP(X,Y) make_pair(X,Y)

#define REP(i,n) for(int i=0;i<n;i++)
#define DREP(i,n) for(int i=n;i>=0;i--)
#define LREP(i,a,b) for(int i=a;i<=b;i++)
#define DLREP(i,a,b) for(int i=a;i>=b;i--)
#define FOR(i,a,b,c) for(int i=a;i<=b;i+=c)

#define fill(a,v) memset(a,v,sizeof(a))
#define DEBUG(x) cout << #x << ": " << x << endl;
#define _n cout << endl;
#define SZ(X) ((int)X.size())
#define all(x) (x).begin(),(x).end()
#define SORT(x) sort(all(x))
#define VI vector<int>
#define VS vector<string>
#define PB push_back
#define REV(a) reverse(all(a))
typedef pair<int, int>PII;
typedef pair<LLI, LLI>PLL;
typedef pair<char, int>PCI;
typedef pair<int, char>PIC;
typedef pair<double, double>PDD;
#define MSI map<string,int>
#define MSLI map<string,LLI>
#define MCI map<char,int>
#define ITR(a,it) __typeof(a.begin())it=a.begin()//****

template<class T> inline T MIN_3(T a, T b, T c){return min(min(a, b), c);}
template<class T> inline T MAX_3(T a, T b, T c){return max(max(a, b), c);}
#define on(bit,pos) ((bit)|(__typeof(bit)1<<(pos-1)))
#define off(bit,pos) ((bit)& ~(__typeof(bit)1<<(pos-1)))
#define check(bit,pos) ((bit)==((bit)|(__typeof(bit))1<<(pos-1))

#define MXE(x) *max_element(all(x))
#define MNE(x) *min_element(all(x))

#define ACM(x) accumulate(all(x),0);
#define CAP(x,y,z) set_intersection (all(x), all(y), z.begin())
#define CUP(x,y,z) set_union(all(x),all(y),z.begin())
#define DIF(x,y,z) set_difference (all(x),all(y),z.begin());
#define BRPS(n,bit) bitset<bit>(n)
//#define REP(i,n) for(int i=0,_n=n; i<_n; i++)

#define DSORT(X)  sort(X.rbegin(), X.rend());
#define read(x) freopen(#x".txt","r",stdin)
#define write(x) freopen(#x".txt","w",stdout)


#define EACH(it,b) for(typeof(b.begin()) it=(b).begin();it!=(b).end();++it)
#define REACH(rit,b) for(typeof(b.rbegin()) rit=(b).rbegin();rit!=b.rend();++rit)
#define PF push_front
#define INS(A, P, B) A.insert(A.begin() + P, B)
#define ERS(A, P) A.erase(A.begin() + P)
#define LB(A, x) (lower_bound(all(A), x) - A.begin())//exactly where it starts
#define UB(A, x) (upper_bound(all(A), x) - A.begin())
#define UNQ(x) SORT(x),(x).erase(unique(all(x)),x.end())
#define INS(A,P, B) A.insert(A.begin() + P, B)
#define ERS(A,P,Q) A.erase(A.begin() + P,A.begin()+Q)

template<class T> inline T BIGMOD(T n, T m, T mod)
//long long pow(long long n, long long m, long long mod = 0)
{
	LLI ans = 1;
	LLI k = n;
	while(m){
		if(m & 1) {
			ans *= k;
			if(ans>mod) ans %= mod;
		}
		k *= k;
		if(k>mod) k %= mod;
		m >>= 1;
	}
	return ans;
}


inline int DBLCMP(double a, double b){
	if(fabs(a - b) <= eps) return 0;
	if(a < b) return -1;
	return 1;
}
template<class T> inline T sqr(T x){return x*x;}
template<class T> inline int countbit(T n){return (n == 0) ? 0 : (1 + countbit(n&(n - 1)));}
template<class T> inline T euclide(T a, T b, T &x, T &y)
{
	if (a < 0){T d = euclide(-a, b, x, y);x = -x;return d;}
	if (b < 0){T d = euclide(a, -b, x, y);y = -y;return d;}
	if (b == 0){x = 1;y = 0;return a;}
	else{T d = euclide(b, a % b, x, y);T t = x;x = y;y = t - (a / b) * y;return d;}
}

template<class T> string toString(T n){ostringstream ost;ost << n;ost.flush();return ost.str();}
template<class T> string toBinary(T n)
{
    string ret="";
    while(n)
    {
        if(n%2==1)ret+='1';
        else ret+='0';
        n>>=1;
    }
    reverse(ret.begin(),ret.end());
    return ret;
}
void combination(int n,vector< vector<int> > &ret)
{
    ret.resize(n+1, vector<int>(n+1, 0));
    for(int i=1;i<=n;i++)
    {
        ret[i][0]=ret[i][i]=1;
        for(int j=1;j<i;j++)
        {
            ret[i][j]=ret[i-1][j]+ret[i-1][j-1];
        }
    }

}
int toInt(string s){int r = 0;istringstream sin(s);sin >> r;return r;}
LLI toLInt(string s){LLI r = 0;istringstream sin(s);sin >> r;return r;}
double toDouble(string s){double r = 0;istringstream sin(s);sin >> r;return r;}
vector<string> parse(string temp){vector<string> ans;ans.clear();string s;istringstream iss(temp);while (iss >> s)ans.PB(s);return ans;}
template<class T> inline T gcd(T a, T b){if (a < 0)return gcd(-a, b);if (b < 0)return gcd(a, -b);return (b == 0) ? a : gcd(b, a % b);}
template<class T> inline T lcm(T a, T b){if (a < 0)return lcm(-a, b);if (b < 0)return lcm(a, -b);return a*(b / gcd(a, b));}
template<class T> inline T power(T b, T p){if (p < 0)return -1;if (b <= 0)return -2;if (!p)return 1;return b*power(b, p - 1);}
#define fst first
#define snd second
//istringstream(temp) >> data >> value >> stamp;
//mod1 = 1000000007, mod2 = 1000000009;
//.016-.040-.900-2.48
/***************************************************************************************************************************************/
int m,n,k,a;

int sum[100009];
vector<int>T;

int bs(int ptr)
{
    int low=0,high=n,mid;
    int ret;
    while(low<high)
    {
        mid=(low+high)/2;
        if(sum[ptr]-sum[mid]<k)
        {
            high=mid-1;
        }
        else
        {
            low=mid+1;
            ret=low;
        }
    }
    return ret;
}

int main()
{

    //read(inp);
    //write(out);

    scanf("%d %d %d",&n,&m,&k);
    for(int i=1;i<=n;i++)
    {
        scanf("%d",&a);
        sum[i]=sum[i-1]+a;
    }
    REP(i,m)
    {
        scanf("%d",&a);
        T.PB(a);
    }
    SORT(T);
    int ct;//current time
    int ptr=0;
    long long res=0;
    bool f=0;
    REP(i,m)
    {
        ct=T[i];
        if(n-ptr+res<ct)
        {
            cout << "#1" << endl;
            res=res+(n-ptr);
            f=1;
            break;
        }
        else
        {
            cout << "#2" << endl;
            ptr=bs(ptr);
            res=ct;
        }
    }
    cout << ptr
    if(f==0)res=res+n-(ptr);
    cout << res << endl;
    return 0;
}