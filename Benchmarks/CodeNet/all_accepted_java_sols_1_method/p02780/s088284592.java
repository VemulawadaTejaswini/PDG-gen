import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		double[] p=new double[n+1];
		for(int i=0;i<n; i++){
			p[i+1]=sc.nextInt();
		}
		double sum=0;
		for(int i=0; i<k-1; i++){
			sum+=p[i+1];
		}
		int r=0;
		double max=0;
		for(int i=k-1; i<n; i++){
			sum+=p[i+1]-p[i+1-k];
			if(max<sum){
				max=sum;
				r=i+1;
			}
		}
		double ans=0;
		for(int i=r; i>r-k; i--){
			ans+=(p[i]+1)/2;
		}
		System.out.println(ans);
	}
}
