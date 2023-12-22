import java.util.*;

public class Main {

	static long gcd(long x,long y) {
		if (x<y)gcd(y,x);
		if (y%x==0)return x;		
		return gcd(y,x%y);
	}
	
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		long a=Long.parseLong(scan.next());
		long b=Long.parseLong(scan.next());
		long c=Long.parseLong(scan.next());
		long d=Long.parseLong(scan.next());
		
		long lcm=c*d/gcd(c,d);
		
		//a未満でｃでもｂでも割れない数
		--a;
		long ans1=a/c+a/d-a/lcm;
		ans1=a-ans1;
		//b以下でｃでもｂでも割れない数		
		long ans2=b/c+b/d-b/lcm;
		ans2=b-ans2;		
	
		System.out.print(ans2-ans1);
} 	
}
//end