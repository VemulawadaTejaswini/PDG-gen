import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long k=sc.nextInt();
		int ans=0;
		while(n>0){
			ans++;
			n/=k;
		}
		System.out.println(ans);
	}
}
