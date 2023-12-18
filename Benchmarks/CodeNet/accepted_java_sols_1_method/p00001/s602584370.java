import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] hills = new int[10];
		for (int i = 0; i < 10; i++) {
			hills[i] = in.nextInt() * -1;
		}
		Arrays.sort(hills);
		for (int i = 0; i < 3; i++) {
			System.out.println(hills[i] * -1);
		}
	}
}