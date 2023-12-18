import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long a = scn.nextLong();
		Double n = scn.nextDouble();
		Double ans = a * n;
		System.out.println(ans);
		long m = (long) Math.floor(ans);
		System.out.println(m);
	}
}