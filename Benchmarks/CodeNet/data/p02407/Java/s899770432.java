import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (sc.hasNext()) {
			String[] array = sc.nextLine().split(" ");
			Arrays.sort(array, Collections.reverseOrder());
			StringBuilder sb = new StringBuilder();
			for (String s : array) {
				sb.append(s);
				sb.append(" ");
			}
			System.out.println(sb.toString());
			break;
		}
	}
}