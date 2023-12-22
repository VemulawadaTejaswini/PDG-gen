import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		int wa = a + b;
		int sa = a - b;
		int seki = a * b;
		int[] ar = new int[3];
		ar[0] = wa;
		ar[1] = sa;
		ar[2] = seki;

		System.out.println(Arrays.stream(ar).max().getAsInt());

		sc.close();

	}

}
