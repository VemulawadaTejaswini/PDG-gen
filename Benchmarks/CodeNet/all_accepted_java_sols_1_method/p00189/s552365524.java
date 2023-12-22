import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		try(Scanner sc=new Scanner(System.in)){
			while(sc.hasNext()) {
				int n=sc.nextInt();
				if(n==0) break;
				
				int max=0;
				int[][] d=new int[10][10];
				int INF=1000000000;
				for(int i=0; i<=9; i++) {
					for(int j=0; j<=9; j++) {
						d[i][j]=INF;
					}
				}
				for(int i=1; i<=n; i++) {
					int a=sc.nextInt();
					int b=sc.nextInt();
					int c=sc.nextInt();
					max=Math.max(max, Math.max(a, b));
					d[a][b]=d[b][a]=c;
				}
				max++;
				for(int i=0; i<max; i++) {
					d[i][i]=0;
				}
				for(int k=0; k<max; k++) {
					//System.out.println("k="+k);
					for(int i=0; i<max; i++) {
						for(int j=0; j<max; j++) {
							d[i][j]=Math.min(d[i][j], d[i][k]+d[k][j]);
							//System.out.println("d["+i+"]["+j+"]="+d[i][j]);
						}
					}
				}
				int min=INF;
				int sum=0, mini=0;
				for(int i=0; i<max; i++) {
					sum=0;
					for(int j=0; j<max; j++) {
						sum+=d[i][j];
					}
					if(min>sum) {
						mini=i;
						min=sum;
					}
				}
				System.out.println(mini+" "+min);
				
			}



		}
	}
}
