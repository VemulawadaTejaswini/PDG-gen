import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int v=sc.nextInt();
			int e=sc.nextInt();
			int r=sc.nextInt();
			int INF=100000000;
			int[] s=new int[e];
			int[] t=new int[e];
			int[] cost=new int[e];
			for(int i=0; i<e; i++) {
				s[i]=sc.nextInt();
				t[i]=sc.nextInt();
				cost[i]=sc.nextInt();
			}
			int[] d=new int[v];
			for(int i=0; i<v; i++) {
				d[i]=INF;
			}
			d[r]=0;
			int count=0;
			int end=1;
			for(int k=0; k<v; k++) {
				count++;
				//System.out.println("k="+k);
				boolean update=false;
				for(int i=0; i<e; i++) {
					if(d[s[i]]<INF && d[t[i]]>d[s[i]]+cost[i]) {
						if(count==v) {
							end=0;
							break;
						}
						d[t[i]]=d[s[i]]+cost[i];
						update=true;
					}
					//System.out.println("d["+t[i]+"]="+d[t[i]]);
				}
				if(! update) {
					break;
				}
				if(end==0) {
					break;
				}
			}
			if(end==0) {
				System.out.println("NEGATIVE CYCLE");
			}
			else {
				for(int i=0; i<v; i++) {
					if(d[i]==INF) System.out.println("INF");
					else System.out.println(d[i]);
				}
			}
			
		}
	}
}
