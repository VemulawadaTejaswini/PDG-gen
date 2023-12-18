import java.util.*;
class Main{
	static final int MaxN=100000+1;
	static boolean vis[]=new boolean[MaxN];
	static LinkedList<LinkedList<Integer>>link=new LinkedList<LinkedList<Integer>>();
		static int id[]=new int [MaxN];
static int rank[]=new int [MaxN];
public static class DSU{


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
}}
static boolean connected(int i,int j){

	return root(i)==root(j);
}

}
static void dfs(int i){
vis[i]=true;
for(int x:link.get(i)){
if(!vis[x])
	dfs(x);}
}
	static Scanner scan=new Scanner(System.in);

public static void main(String[] args) {


	//
	
	int n=scan.nextInt();
	int m=scan.nextInt();
	int temp=0;
		for(int i=0;i<=n;i++){

link.add(new LinkedList());
	}
	for(int i=0;i<m;i++){
		//link.add(new LinkedList());
		int a=scan.nextInt();
		int b=scan.nextInt();
		link.get(a).add(b);
		link.get(b).add(a);
	}
	
int cnt=0;
for(int i=1;i<=n;i++){
	if(!vis[i]){
		dfs(i);
		cnt++;
	}
}



	

System.out.println(cnt-1);
}
}