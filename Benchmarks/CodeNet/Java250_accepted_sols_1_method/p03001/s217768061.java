import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		long W = sc.nextLong();
		long H = sc.nextLong();
		long x = sc.nextLong();
		long y = sc.nextLong();
		int result = (x*2 == W && y*2 == H)?1:0;
		sc.close();
		System.out.print((double)(W*H)/2 + " " + result);
	}
}