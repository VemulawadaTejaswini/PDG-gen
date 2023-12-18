#include<stdio.h>
#include<map>
#include<vector>
#include<algorithm>
using namespace std;
typedef long long LL;
LL gcd(LL a,LL b){if(b)while((a%=b)&&(b%=a));return a+b;}
struct XD{
    LL u,d;
    XD(){}
    XD(LL uu,LL dd):u(uu),d(dd){
        LL x=gcd(uu,dd);
        u/=x;d/=x;
        if(d<0){
            d=-d;
            u=-u;
        }
    }
    LL hash(){
        return u*333331+d;
    }
    bool operator<(const XD& b)const{
        return (double)u/d<(double)b.u/b.d;
    }
};
struct PT{
    LL x,y;
    int pos;
    PT(){}
    PT(LL xx,LL yy):x(xx),y(yy){}
    LL operator^(const PT& p)const{
        return x*p.y-y*p.x;
    }
    LL operator*(const PT& p)const{
        return x*p.x+y*p.y;
    }
    void calcPos(){
        pos=(y>0||(y==0&&x>0))?-1:1;
    }
    LL len2()const{return x*x+y*y;}
    bool operator<(const PT& p)const{
        if(pos!=p.pos)return pos<p.pos;
        LL s=(*this)^p;
        if(s==0)return len2()<p.len2();
        else return s>0;
    }
};
LL s[400000];
void lex_smallest_head(vector<LL>& in) {
    int n=in.size();
    for(int i=0;i<n;i++)
        s[i]=s[i+n]=in[i];
    int i=0,j=1,k=0;
    while(j<n&&k<n) {
        if(s[i+k]==s[j+k]) k++;
        else {
            if(s[i+k]<s[j+k]) j+=k+1;
            else i+=k+1;
            k=0;
        }
        if(i==j) j++;
    }
    for(j=0;j<n;j++)in[j]=s[i+j];
}
struct XDD{
    vector<PT> pi;
    int cp;
    LL hs;
    XDD(){
        int n;
        scanf("%d",&n);
        pi.resize(n);
        LL xs=0,ys=0;
        int i;
        for(i=0;i<n;i++){
            int x,y;
            scanf("%d%d",&x,&y);
            pi[i].x=x*n;
            pi[i].y=y*n;
            xs+=x;ys+=y;
        }
        cp=0;
        for(i=0;i<n;i++){
            pi[i].x-=xs;pi[i].y-=ys;
            if(pi[i].x==0&&pi[i].y==0){
                cp++;
                swap(pi[i],pi[n-1]);
                n--;
                i--;
                pi.pop_back();
                continue;
            }
            pi[i].calcPos();
        }
        sort(pi.begin(),pi.end());
        LL mv=-1000000000000000LL;
        vector<XD> val(n);
        vector<bool> issame(n);
        for(i=0;i<n;i++){
            int j=(i==n-1?0:i+1);
            LL x=pi[i]^pi[j];
            if(x==0){
                issame[i]=1;
                val[i]=XD(pi[i].len2(),pi[j].len2());
            }else{
                issame[i]=0;
                val[i]=XD(pi[i]^pi[j],1);
                mv=max(mv,val[i].u);
            }
        }
        for(i=0;i<n;i++)if(!issame[i])val[i]=XD(val[i].u,mv);
        vector<LL> hash(n);
        for(i=0;i<n;i++)hash[i]=(issame[i]?1:0)+val[i].hash()*2;
        lex_smallest_head(hash);
        hs=0;
        for(i=0;i<n;i++)hs=hs*1097774749+hash[i];
    }
    pair<pair<int,int>,LL> hash(){
        return make_pair(make_pair(pi.size(),cp),hs);
    }
};
map<pair<pair<int,int>,LL>,vector<int> > in;
int main(){
    int n,i;
    scanf("%d",&n);
    for(i=0;i<n;i++){
        in[XDD().hash()].push_back(i+1);
    }
    printf("%d\n",in.size());
    for(map<pair<pair<int,int>,LL>,vector<int> >::iterator it=in.begin();it!=in.end();it++){
        for(i=0;i<(it->second).size();i++)printf("%d ",(it->second)[i]);puts("0");
    }
}