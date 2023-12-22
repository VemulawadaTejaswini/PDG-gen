import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long ans=0;
		for(int i=1;i<=1000000;i++) {
			ans+=n/i;
			int b=n/i;
			if(b*i==n)
				ans--;
		}
		System.out.println(ans);
	}
}