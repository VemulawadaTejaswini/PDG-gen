import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
 
 
public class Main{
	
	public static class UnionFind{
		int[] par;
		UnionFind(int n){
			par=new int[n];
			for(int i=0;i<n;i++)par[i]=i;
		}
		
		public int find(int x){
			if(par[x]==x)return x;
			return par[x]=find(par[x]);
		}
		
		public Boolean same(int x,int y){
			return find(x)==find(y);
		}
		
		public void unite(int x,int y){
			if(find(x)==find(y))return;
			par[find(x)]=find(y);
		}
		
		public void init(){
			for(int i = 0; i < par.length; i++){
				par[i] = i;
			}
		}
	}
	
	public static final int MAX = 100000;
	
    public static void main(String[] args){
    	
    	final Scanner sc = new Scanner(System.in);
    	
    	int[] par = new int[MAX];
    	UnionFind uf = new UnionFind(MAX);
    	boolean[] q_mark = new boolean[MAX];
    	int[] q_value = new int[MAX];
    	
    	boolean[] marked = new boolean[MAX];
    	
    	while(true){
    		final int N = sc.nextInt();
    		final int Q = sc.nextInt();
    		
    		if(N == 0 && Q == 0){
    			break;
    		}
    		
    		Arrays.fill(marked, false);
    		uf.init();
    		par[0] = 1;
    		for(int i = 1; i < N; i++){
    			par[i] = sc.nextInt() - 1;
    		}
    		
    		for(int i = 0; i < Q; i++){	
    			q_mark[i] = sc.next().equals("M");
    			q_value[i] = sc.nextInt() - 1;
    			
    			if(q_mark[i]){
    				marked[q_value[i]] = true;
    			}
    		}
    		
    		for(int i = 0; i < N; i++){
    			if(!marked[i]){
    				uf.unite(i, par[i]);
    			}
    		}
    		
    		long sum = 0;
    		for(int i = Q - 1; i >= 0; i--){
    			if(q_mark[i]){
    				uf.unite(i, par[i]);
    			}else{
    				sum += uf.find(q_value[i]);
    			}
    		}
    		
    		System.out.println(sum);
    	}
    	
    }
     
}