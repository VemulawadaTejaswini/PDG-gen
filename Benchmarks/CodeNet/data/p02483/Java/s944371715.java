import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[] index = new int[3];

		for (int i = 0; i < 3; i++) {
			index[i] = in.nextInt();
		}

		Arrays.sort(index);

		System.out.println(index[0] + " " + index[1] + " " + index[2]);
	}
}