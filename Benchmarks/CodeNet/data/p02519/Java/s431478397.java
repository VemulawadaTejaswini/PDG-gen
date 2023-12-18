#include<iostream>
#include<cstdio>
#include<queue>
#include<stack>
#include<cassert>
using namespace std;
#define REP(i,b,n) for(int i=b;i<n;i++)
#define rep(i,n)   REP(i,0,n)

const int N = 20000;//max element
queue<int> B;
stack<int> F;
deque<int> minback,maxback;
int minfront[N],minp=0;
int maxfront[N],maxp=0;

//operation front
inline int fPop(){
  int ret=F.top();
  F.pop();
  if (minp>0&&minfront[minp-1] == ret)minp--;
  if (maxp>0&&maxfront[maxp-1] == ret)maxp--;
  return ret;
}

inline void fPush(int v){
  F.push(v);
  if (minp==0 || minfront[minp-1] > v)minfront[minp++]=v;
  if (maxp==0 || maxfront[maxp-1] < v)maxfront[maxp++]=v;
}

inline int getIthMinFront(int i){
  assert(minp-i >= 0);
  return minfront[minp-i];
}

inline int getIthMaxFront(int i){
  assert(maxp-i >= 0);
  return maxfront[maxp-i];
}

//operation back
inline int bPop(){
  int ret=B.front();
  B.pop();
  if (!minback.empty() && minback.front() == ret)minback.pop_front();
  if (!maxback.empty() && maxback.front() == ret)maxback.pop_front();
  return ret;
}

inline void bPush(int v){
  B.push(v);
  while(!minback.empty()){
    if (minback.back() > v)minback.pop_back();
    else break;
  }
  minback.push_back(v);

  while(!maxback.empty()){
    if (maxback.back() < v)maxback.pop_back();
    else break;
  }
  maxback.push_back(v);
}

inline int getIthMinBack(int i){
  assert(i <= (int)minback.size());
  return minback[i-1];
}

inline int getIthMaxBack(int i){
  assert(i <= (int)maxback.size());
  return maxback[i-1];
}

void push(int v){
  if (F.size() == 0){
    fPush(v);
  }else if (F.size() == B.size()){
    int tmp=bPop();
    fPush(tmp);
    bPush(v);
  }else if (F.size() > B.size()){
    bPush(v);
  }else assert(false);
}

int pop(){
  assert(F.size() != 0);
  int ret;
  if (F.size() == B.size()){
    int tmp=bPop();
    ret=fPop();
    fPush(tmp);
  }else if (F.size() > B.size()){
    ret=fPop();
  }else assert(false);
  return ret;
}

int main(){
  int q;
  while(scanf("%d",&q) && q){
    minback.clear();
    maxback.clear();
    minp=0;
    maxp=0;
    while(!B.empty())B.pop();
    while(!F.empty())F.pop();

    rep(k,q){
      int val,ret,in;
      scanf("%d",&in);
      switch(in){
      case 0:
	scanf("%d",&val);
	push(val);
	break;
      case 1:
	ret=pop();
	//cout <<"pop " <<  ret << endl;
	printf("%d\n",ret);
	break;
      case 2:
	//cout << "minfront " << getIthMinFront(1)<<endl;
	printf("%d\n",getIthMinFront(1));
	break;
      case 3:
	//cout <<"minback " << getIthMinBack(1) << endl;
	printf("%d\n",getIthMinBack(1));
	break;
      case 4:
	scanf("%d",&val);
	//cout <<val <<" th min front " << getIthMinFront(val) << endl;
	printf("%d\n",getIthMinFront(val));
	break;
      case 5:
	scanf("%d",&val);
	//cout <<val <<" th min back " << getIthMinBack(val) << endl;
	printf("%d\n",getIthMinBack(val));
	break;
      case 6:
	//cout << "maxfront " << getIthMaxFront(1)<<endl;
	printf("%d\n",getIthMaxFront(1));
	break;
      case 7:
	//cout << "maxback " << getIthMaxBack(1) << endl;
	printf("%d\n",getIthMaxBack(1));
	break;
      case 8:
	scanf("%d",&val);
	//cout <<val <<" th max front " << getIthMaxFront(val) << endl;
	printf("%d\n",getIthMaxFront(val));
	break;
      case 9:
	scanf("%d",&val);
	//cout <<val <<" th max back " << getIthMaxBack(val) << endl;
	printf("%d\n",getIthMaxBack(val));
	break;
      }
    }
    cout <<"end"<<endl;
  }
  return false;
}