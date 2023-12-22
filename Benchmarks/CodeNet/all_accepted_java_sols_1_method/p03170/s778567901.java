import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] a=new int[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
		}
		boolean[] dp=new boolean[k+1];
		for(int i=1; i<=k; i++){
			for(int j=0; j<n; j++){
				if(i<a[j] || dp[i]) break;
				dp[i]|=!dp[i-a[j]];
			}
		}
		if(dp[k]){
			System.out.println("First");
		}else{
			System.out.println("Second");
		}
	}
}