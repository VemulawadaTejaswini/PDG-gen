import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long ans = 0;
		for(int i=1;i<=n;i++) {
			ans+=fun(i);
		}
		System.out.println(ans);
	}
	public static long fun(long x) {
		long ans=0;
		long count=0;
		for(int i=1;i<=x;i++) {
			if(x%i==0)count++;
		}

		return x*count;
	}
}