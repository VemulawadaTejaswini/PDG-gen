
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int firstNumber = scan.nextInt();
		int i[] = new int[3];
		for (int k = 0; k < firstNumber; k++) {
			for (int j = 0; j < i.length; j++) {
				i[j] = scan.nextInt();
			}
			Arrays.sort(i);
			if ((i[2] * i[2]) == (i[1] * i[1]) + (i[0] * i[0])) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}
}