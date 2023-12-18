import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String args[]){
		try(Scanner sc=new Scanner(System.in)){
			int v=sc.nextInt();//頂点数
			int e=sc.nextInt();//辺数
			int r=sc.nextInt();//始点
			int inf=10000*100000+100;
			int[] c=new int[v+1];//始点からの距離
			int[] S=new int[e+1];
			int[] T=new int[e+1];
			int[] D=new int[e+1];
			Arrays.fill(c, inf);
			Arrays.fill(D, inf);
			for(int i=0; i<e; i++) {
				S[i]=sc.nextInt();
				T[i]=sc.nextInt();
				D[i]=sc.nextInt();
			}
			c[r]=0;
			for(int k=0; k<v; k++) {
				boolean update=false;
				for(int i=0; i<e; i++) {
					int s=S[i], t=T[i], d=D[i];
					if(c[s]<inf && c[s]+d<c[t]) {
						c[t]=c[s]+d;
						update=true;
					}
				}
				if(! update) break;
			}
			for(int i=0; i<v; i++) {
				if(c[i]==inf) {
					System.out.println("INF");
				}
				else {
					System.out.println(c[i]);
				}
			}
		}
	}
}
