
#include <bits/stdc++.h>


using namespace std;
double pi=3.14159265358979323846264338;
long long sum;

long long n,k,st,h,w,m;
int tx,ty,gx,gy,cx,cy;

string s;
const int dx[4]={-1,1,0,0};
const int dy[4]={0,0,-1,1};
int arr[300001],arr2[300001];
vector<int>ar,ar2;
map<pair<int,int>,int>ma;
long long pr(long long a, long long b){
	long long k=1;
	if(b==0)return 1;
	
	for(int i=0;i<b;i++)k=k*10;
	return k;
}


int main(){
	cin>>a>>b>>c;
	if(b*c>=a)cout<<"Yes"<<endl;
	ele cout<<"No"<<endl;
	return 0;
}