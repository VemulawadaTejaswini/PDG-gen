import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static int getInt(){
		return Integer.parseInt(s.next());
	}
	public static void main(String[] __){
		int n=getInt(),m=getInt(),dp[]=IntStream.rangeClosed(0,n).toArray();
		for(int l=0;l<m;l++){
			int c=getInt();
			for(int i=0;i+c<=n;i++){
				dp[i+c]=Math.min(dp[i+c],dp[i]+1);
			}
		}
		System.out.println(dp[n]);
	}
}