#include <stdio.h>
#include <stdlib.h>
#define N 100005
#define NIL -1
typedef struct node{
  int parent;
  int right;
  int left;
}Node;

Node T[N];
int n,D[N];

void print(int);

int main()
{
  int i,j,d,v,c,l,r;

  scanf("%d",&n);
  for(i=0;i<n;i++){
    T[i].parent = T[i].right = T[i].left = NIL;
  }

  for(i=0;i<n;i++){
    scanf("%d%d",&v,&d);
    for(j=0;j<d;j++){
      scanf("%d",&c);
      if(j==0){
	T[v].left=c;
      }
      else T[l].right=c;
      l=c;
      T[c].parent=v;
    }
  }

  for(i=0;i<n;i++){
    if(T[i].parent==NIL){
      r=i;
    }
  }

  rec(r,0);

  for(i=0;i<n;i++){
    print(i);
  }
 
  return 0;
  
}

void print(int a){
  int i,c;
  printf("node %d: ",a);
  printf("parent = %d,  ",T[a].parent);
  printf("depth = %d,  ",D[a]);

  if(T[a].parent==NIL) printf("root, ");
  else if(T[a].left==NIL) printf("leaf, ");
  else printf("internal node, ");

  printf("[");
  for(i=0, c=T[a].left; c != NIL; i++, c=T[c].right){
    if(i) printf(", ");
    printf("%d",c);
  }

  printf("]\n");
  
}

int rec(int u,int p){
  D[u] = p;
  if(T[u].right != NIL) rec(T[u].right,p);
  if(T[u].left != NIL) rec(T[u].left,p+1);
}



