import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var a = IntStream.range(0, n).map(i -> sc.nextInt()).toArray();
		sc.close();

		var sum = new boolean[32];
		for (int i = 0; i < n; i++) {
			sum = xor(getBits(a[i]), sum);
		}

		var sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if(sb.length() > 0) {
				sb.append(" ");
			}
			sb.append(getInt(xor(getBits(a[i]), sum)));
		}
		System.out.println(sb.toString());
	}

	public static boolean[] getBits(int n) {
		var bits = new boolean[32];
		for (int i = 0; i < 32; i++) {
			bits[i] = ((n % (int) Math.pow(2, i + 1)) / ((int) Math.pow(2, i))) != 0;
		}
		return bits;
	}

	public static int getInt(boolean[] bits) {
		var value = 0;
		for (int i = 0; i < 32; i++) {
			value += bits[i] ? Math.pow(2, i) : 0;
		}
		return value;
	}

	public static boolean[] xor(boolean[] bits1, boolean[] bits2) {
		var bits = new boolean[32];
		for (int i = 0; i < 32; i++) {
			bits[i] = bits1[i] ^ bits2[i];
		}
		return bits;
	}
}
