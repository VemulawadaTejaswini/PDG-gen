import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long s = in.nextLong();
		long limit = (long) Math.pow(10, 9);

		long x3 = limit - s % limit;
		long y3 = s / limit + 1;
		
		if(s == (long)Math.pow(10, 18)) {
			y3 = limit;
			x3 = 0;
		}
		
		System.out.println("0 0 1000000000 1 "  + x3 + " " + y3 );

		in.close();
	}
}
