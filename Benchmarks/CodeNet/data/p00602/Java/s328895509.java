import java.util.Scanner;

public class Main {
	
	static int[] par=new int[1001];
	static void init(int n) {
		for(int i=0; i<=n; i++) {
			par[i]=i;
		}
	}
	
	static int root(int x) {
		if(par[x]==x) return x;
		return par[x]=root(par[x]);
	}
	
	static void unite(int x, int y) {
		par[root(x)]=root(y);
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int[] F=new int[1001];
			for(int i=2; i<=1000; i++) {
				F[0]=1;
				F[1]=2;
				F[i]=F[i-2]+F[i-1];
				F[i]%=1001;
			}
			while(sc.hasNext()) {
				int V=sc.nextInt();
				int d=sc.nextInt();
				init(V);
				for(int i=1; i<=V; i++) {
					for(int j=i+1; j<=V; j++) {
						if(Math.abs(F[j]-F[i])<d) {
							unite(i, j);
						}
					}
				}
				int count=0;
				for(int i=1; i<=V; i++) {
					if(par[i]==i) {
						count++;
					}
				}
				System.out.println(count);
			}
			
			
			
		}
	}
}
