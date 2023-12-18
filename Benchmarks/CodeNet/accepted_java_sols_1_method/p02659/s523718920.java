import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		String B = sc.next();
		sc.close();
		int B100 = 0;
		B100 += Integer.parseInt(B.substring(0, 1)) * 100;
		B100 += Integer.parseInt(B.substring(2, 3)) * 10;
		B100 += Integer.parseInt(B.substring(3, 4)) * 1;
		System.out.println((long) A * B100 / 100);
	}
}
