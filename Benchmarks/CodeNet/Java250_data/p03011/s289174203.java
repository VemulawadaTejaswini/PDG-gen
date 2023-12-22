import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] d = new int[3];

		for(int i = 0; i < d.length; i++) {
			d[i] = sc.nextInt();
		}
		Arrays.sort(d);

		System.out.println(d[0] + d[1]);
	}
}