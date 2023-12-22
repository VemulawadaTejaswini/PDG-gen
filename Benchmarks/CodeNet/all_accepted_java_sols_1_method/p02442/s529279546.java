import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String numA = s.nextLine();
		String a = s.nextLine();
		String numB = s.nextLine();
		String b = s.nextLine();

		String[] aa = a.split(" ");
		String[] bb = b.split(" ");

		int[] ai = Arrays.stream(aa).mapToInt(Integer::parseInt).toArray();
		int[] bi = Arrays.stream(bb).mapToInt(Integer::parseInt).toArray();

		int index = 0;
		while (true) {
			if (index >= bi.length) {
				System.out.println(0);
				break;
			} else if (index >= ai.length) {
				System.out.println(1);
				break;
			}

			if (bi[index] > ai[index]) {
				System.out.println(1);
				break;
			} else if (ai[index] > bi[index]) {
				System.out.println(0);
				break;
			}

			index++;
		}
	}
}

