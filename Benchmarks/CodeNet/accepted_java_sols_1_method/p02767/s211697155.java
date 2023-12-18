import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] x=new int[n];
		long ans=Long.MAX_VALUE;
		for(int i=0; i<n; i++){
			x[i]=sc.nextInt();
		}
		for(int i=1; i<101; i++){
			long min=0;
			for(int j=0; j<n; j++){
				min+=(x[j]-i)*(x[j]-i);
			}
			ans=Math.min(ans,min);
		}
		System.out.println(ans);
	}
}
