#include <bits/stdc++.h>
using namespace std;

#define rep(i,x,y) for(int i=(x);i<(y);++i)
#define debug(x) #x << "=" << (x)

#ifdef DEBUG
#define _GLIBCXX_DEBUG
#define dump(x) std::cerr << debug(x) << " (L:" << __LINE__ << ")" << std::endl
#else
#define dump(x)
#endif

typedef long long int ll;
typedef pair<int,int> pii;
//template<typename T> using vec=std::vector<T>;

const int inf=1<<30;
const long long int infll=1LL<<58;
const double eps=1e-9;
const int dx[]={1,0,-1,0},dy[]={0,1,0,-1};

template <typename T> ostream &operator<<(ostream &os, const vector<T> &vec){
    os << "[";
    for (const auto &v : vec) {
    	os << v << ",";
    }
    os << "]";
    return os;
}

void solve(){
    while(true){
        string enc;
        cin >> enc;
        if(enc=="#") break;
        if([&](){
            for(const char ch:enc) if(ch=='z') return true;
        }()){
            cout << 0 << endl;
            continue;
        }

        int num=0;
        set<string> s1,s2;
        function<void(const int,string&,vector<bool>&)> rec=[&](const int k,string &res,vector<bool> &done){
            if(k==enc.size()){
                ++num;
                s1.insert(res);
                s2.insert(res);
                if(s1.size()>10){
                    auto it=s1.end();
                    --it;
                    s1.erase(it);
                }
                if(s2.size()>10) s2.erase(s2.begin());
                return;
            }
            if(!done[enc[k]-'a']){
                ++res[k];
                done[enc[k]-'a']=true;
                rec(k+1,res,done);
                --res[k];
                done[enc[k]-'a']=false;
            }
            if(enc[k]=='a' or done[enc[k]-'a'-1]) rec(k+1,res,done);
        };
        string res=enc;
        vector<bool> done(26,false);
        rec(0,res,done);

        cout << num << endl;
        if(num<=10) for(const auto &dec:s1) cout << dec << endl;
        else{
            {
                int i=0;
                for(auto it=s1.begin(); i!=5; ++i,++it) cout << *it << endl;
            }
            {
                int i=0;
                for(auto it=s2.begin(); i!=5; ++i,++it) cout << *it << endl;
            }
        }
    }
}

int main(){
    std::ios::sync_with_stdio(false);
    std::cin.tie(0);
    cout << fixed << setprecision(8);
    solve();
    return 0;
}