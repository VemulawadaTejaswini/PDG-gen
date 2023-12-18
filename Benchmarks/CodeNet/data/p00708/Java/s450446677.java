#include<iostream>
#include<cmath>

using namespace std;
double x[100], y[100], z[100], r[100],sum,mn,maxd=99999999.9;
int n,m,mx=(1<<20),a,b,c,t,hozon;
double map[100][100];
double sumcor;
int p[100];
double d[100];
int visited[100];

double compute(int i, int j) {
  double ret;

  ret = sqrt((x[i]-x[j]) * (x[i]-x[j]) + (y[i]-y[j]) * (y[i]-y[j]) + (z[i]-z[j]) * (z[i]-z[j]));

  return ret;
}

int main(){
  while(1){
    cin>>n;
    if(n==0)break;

    for(int i=0;i<n;i++) {
      cin>>x[i]; cin>>y[i]; cin>>z[i]; cin>>r[i];
    }

    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
	map[i][j]=maxd;
      }
      p[i]=0;
      d[i]=maxd;
      visited[i]=0;
    }
    
    for(int i=0; i<n; i++) {
      for(int j=0; j<n; j++) {
	if(i==j) continue;
	map[i][j] = compute(i, j);
	map[i][j]-=(r[i]+r[j]);
	if(map[i][j]<0)map[i][j]=0;
      }
    }


    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
	//	cout<<map[i][j]<<endl;
      }
    }
    
    sumcor=0.0;
    d[0]=0.0;
    while(1){
      mn=maxd;
      for(int i=0;i<n;i++){
	if(d[i]<mn&&visited[i]==0){
	  mn=d[i];
	  t=i;
	}
      }
      if(mn==maxd)break;
      visited[t]=1;
      for(int v=0;v<n;v++){
	if(map[t][v]<d[v]&&visited[v]==0){
	  d[v]=map[t][v];
	  p[v]=t;
	}
      }
    }
    for(int i=0;i<n;i++)if(map[i][p[i]]!=maxd)sumcor+=map[i][p[i]];
    printf("%4.3f\n",sumcor);
  }
  return 0;
}