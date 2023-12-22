import java.util.*;

public class Main {

	public static void main(
			String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] abcd = new int[4];
		for (int i = 0; i < 4; i++) {
			abcd[i] = sc.nextInt();
		}
		int ab = abcd[0] > abcd[2] ? abcd[0] : abcd[2];
		int cd = abcd[1] < abcd[3] ? abcd[1] : abcd[3];
		System.out.println(cd - ab > 0 ? cd - ab : 0);
	}
}
