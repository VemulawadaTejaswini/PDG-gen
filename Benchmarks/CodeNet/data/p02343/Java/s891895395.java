import java.util.Scanner;

public class Main{
	
	static int[] p;
	
	static int root(int a) {
		if(p[a]==a) return a;
		return (p[a]=root(p[a]));
	}
	
	static void unite(int x, int y) {
		p[root(x)]=root(y);
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int n=sc.nextInt();
			int q=sc.nextInt();
			p=new int[n+1];
			
			for(int i=0; i<n; i++) {
				p[i]=i;
			}
			for(int i=0; i<q; i++) {
				int com=sc.nextInt();
				int x=sc.nextInt();
				int y=sc.nextInt();
				if(com==0) {
					unite(x, y);
				}
				if(com==1) {
					System.out.println((root(x)==root(y))? 1:0);
				}
			}
			

		}
	}
}
