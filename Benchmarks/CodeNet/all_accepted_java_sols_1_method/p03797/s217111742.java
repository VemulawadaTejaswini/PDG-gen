import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		long n = Long.parseLong(scan.next());
		long m = Long.parseLong(scan.next());

		long ans = 0;
		ans += Math.min(n,m/2);
		n -=ans;
		m -=ans*2;
		if (m > 0){
			ans+=m/4;
		}
		System.out.print(ans);

	}
}
//end
