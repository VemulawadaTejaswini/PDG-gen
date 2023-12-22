
import java.util.Arrays;
import java.util.Scanner;


public class Main {
	static long MOD = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		Arrays.sort(s);
		StringBuilder sb = new StringBuilder();
		//append
		sb.append(s);

		int zeroind = sb.lastIndexOf("0") + 1;
		int oneind = sb.length()-zeroind;

		System.out.println(Math.min(zeroind,oneind)*2);

	}
}
