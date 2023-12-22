
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long m=sc.nextLong();
		long ans=0;
		if(n>=2){
			ans+=(n*(n-1))/2;
		}
		if(m>=2){
			ans+=(m*(m-1)/2);
		}
		System.out.println(ans);
	}
}
