import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static int n,m,p,a,b,bit;
	static int[] ticket;
	static int[][] edge;
	static double[][] dp;
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		for(;;){
			n=cin.nextInt();
			m=cin.nextInt();
			p=cin.nextInt();
			a=cin.nextInt();
			b=cin.nextInt();
			dp=new double[m+1][1<<8];
			if(n+m+p+a+b==0)break;
			for(int i=0;i<=m;i++){
				Arrays.fill(dp[i],Double.MAX_VALUE);
			}
			bit=0;
			ticket=new int[n];
			for(int i=0;i<n;i++){
				ticket[i]=cin.nextInt();
			}
			edge=new int[31][31];
			for(int i=0;i<31;i++){
				Arrays.fill(edge[i],1<<30);
			}
			for(int i=0;i<p;i++){
				int a=cin.nextInt();
				int b=cin.nextInt();
				edge[a][b]=edge[b][a]=cin.nextInt();
				
			}

			PriorityQueue<double[]> q = new PriorityQueue<double[]>(10000,
					new Comparator<double[]>(){
						public int compare(double[] a,double[] b){
							return Double.compare(a[2], b[2]);
						}
					});
			q.add(new double[]{a,bit,0.0});
			while(!q.isEmpty()){
				double[] array=q.poll();
				int city=(int)array[0];
				int used=(int)array[1];
				double cost=array[2];
//				System.out.println(city+" "+used+" "+cost);

				if(dp[city][used]<cost){
					continue;
				}
				dp[city][used]=cost;
				for(int i=0;i<=m;i++){
					if(edge[city][i]!=1<<30){
						for(int j=0;j<ticket.length;j++){
							if(((1<<j)&used)==0){
								int uu=(used | 1<<j);
								double cc=cost+(double)edge[city][i]/(double)ticket[j];
								q.add(new double[]{i,uu,cc});
							}
						}
					}
				}
			}
			
			double min=Double.MAX_VALUE;
			for(int i=0;i<1<<8;i++)
				if(Double.compare(Double.MAX_VALUE, dp[b][i])!=0)
					min=Math.min(min,dp[b][i]);
			
			if(Double.compare(min,Double.MAX_VALUE)==0){
				System.out.println("Impossible");
			}
			else
				System.out.printf("%.3f\n",min);
			
		}
	}

}