import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long a=scan.nextLong();
		long b=scan.nextLong();
		long x=scan.nextLong();
		long y=scan.nextLong();
		long c=a*x;
		long d=a*y;
		long e=b*x;
		long f=b*y;
		long res=Math.max(Math.max(c, e), Math.max(d, f));
		System.out.println(res);
	
	
	}

}
