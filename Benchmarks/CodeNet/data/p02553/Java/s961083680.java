import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long a=scan.nextLong();
		long b=scan.nextLong();
		long c=scan.nextLong();
		long d=scan.nextLong();
		System.out.println(Math.max(a*c, Math.max(a*d, Math.max(b*c, b*d))));
		scan.close();
	}

}
