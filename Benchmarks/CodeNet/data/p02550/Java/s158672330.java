import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long x=sc.nextLong();
		long m=sc.nextLong();
		long ans=x;
		long prev=x;
		for(int i=2;i<=n;i++) {
			prev=(prev*prev)%m;
			ans+=prev;
		}
		System.out.println(ans);
	}
}