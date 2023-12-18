import java.util.*;
import java.io.PrintWriter;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long ans=0;
		for(long i=1; i<=n; i++){
			ans+=i*((n/i)+1)*(n/i)/2;
		}
		System.out.println(ans);
	}
}
