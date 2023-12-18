import java.util.*;
public class Main {
	static int N;
	static int M;
	static int []rank;
	static int[]par;
	static int[]size;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc= new Scanner(System.in);
		N= sc.nextInt();
		M= sc.nextInt();
		
		rank=new int [N+1];
		par= new int[N+1];
		size= new int[N+1];
		
		for(int i=0;i<=N;i++){
			rank[i]= 0;
			par[i]= i;
			size[i]= 0;
			
		}
		
		for(int i=0;i<M;i++){
			int a= sc.nextInt();
			int b= sc.nextInt();
			
			union(a,b);
		}
		
		sc.close();
		
		int ans=0;
		
		for(int i=1;i<=N;i++){
			int p= find(i);
			size[p]++;
			ans= Math.max(ans, size[p]);
		}
		
		System.out.println(ans);
		
		
	}
	static void union(int x,int y){//rootを繋げて併合
		x= find(x);
		y= find(y);
		if(x== y)return;
		
		if(rank[x] < rank[y]){//高さのバランスを整えるために、rankの大きい方の根に小さい方を繋げる
			par[x]= y;
		}
		else{
			par[y]= x;
			if(rank[x] == rank[y])rank[x]++;
		}
		
	}
	
	static int find(int x){//rootを求める
		if(par[x] == x)return x;
		else{
			par[x]= find(par[x]);
			return  par[x];
		}
		
	}
	
	static boolean same(int x,int y){
		boolean res= false;
		if(find(x) == find(y))res= true;
		
		return res;
	}
}
