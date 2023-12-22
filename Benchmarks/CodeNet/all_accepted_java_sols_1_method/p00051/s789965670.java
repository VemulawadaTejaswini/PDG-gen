import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			char[] carray = in.next().toCharArray();
			Arrays.sort(carray);
			int max = 0;
			int min = 0;
			for (int j = 0; j < 8; j++) {
				int val = Character.getNumericValue(carray[j]);
				min += (int) Math.pow(10, (7 - j)) * val;
				max += (int) Math.pow(10, j) * val;
			}
			System.out.println(max - min);
		}
	}
}