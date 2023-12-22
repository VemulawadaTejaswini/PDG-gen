import java.util.*;

public class Main {
	
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		long n=Long.parseLong(scan.next());
		
		long ans=1000000000000L;
		for (long i=1;i*i<=n;++i) {
			if (n%i!=0)continue;			
			ans=Math.min(ans, i+n/i-2);			
		}
		
		System.out.print(ans);
		
		
}		
}
//end