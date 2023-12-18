import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		long mod=1000000007;
		long ans=1;
		long[] front=new long[n+1];
		long[] back=new long[n+1];
		for(int i=1; i<n+1; i++){
			front[i]=i+front[i-1];
			front[i]%=mod;
		}
		back[0]=n;
		for(int i=1; i<n; i++){
			back[i]+=n-i+back[i-1];
			back[i]%=mod;
		}
		for(int i=k; i<=n; i++){
			ans=(ans+back[i-1]-front[i-1]+1+mod)%mod;
		}
		System.out.println(ans);
	}
}
