import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n+2];
		int[] dist=new int[n+1];
		long sum=0;
		for(int i=1; i<=n; i++){
			a[i]=sc.nextInt();
			if(i>0){
				dist[i-1]=Math.abs(a[i]-a[i-1]);
				sum+=dist[i-1];
			}
		}
		dist[n]=Math.abs(a[n+1]-a[n]);
		sum+=dist[n];
		for(int i=1; i<=n;i++){
			System.out.println(sum-dist[i-1]-dist[i]+Math.abs(a[i-1]-a[i+1]));
		}
	}
}

