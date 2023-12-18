import java.util.*;
class Main{
public static class DSU{
static final int MaxN=100000;
static int id[]=new int [MaxN];
static int rank[]=new int [MaxN];
static int root(int i){
	while(i!=id[i]){
		i=id[i];
	}
	return i;
}

static void union(int p,int q){
int i=root(p);
int j=root(q);
if(rank[i]>rank[j]){
id[j]=id[i];
rank[j]+=rank[i];
}
if(rank[i]<=rank[j]){
id[i]=id[j];
rank[i]+=rank[j];
}}}
	static Scanner scan=new Scanner(System.in);
public static void main(String[] args) {
	int n=scan.nextInt();
	int m=scan.nextInt();
	for(int i=0;i<m;i++){
		int a=scan.nextInt();
		int b=scan.nextInt();

	}
	int edges=n-1;
	System.out.println(edges-m);
	}
}