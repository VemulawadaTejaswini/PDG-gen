
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			String str = sc.nextLine();
			str = sc.nextLine();
			char[] arr = str.toCharArray();

			int first = 0;
			int max = 0;
			for (char c : arr) {
				if (c == ')') first++;
				if (c == '(') first--;
				if (max < first) {
					max = first;
				}
			}
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < max; i++) {
				sb.append("(");
			}
			sb.append(str);
			str = sb.toString();
			arr = str.toCharArray();

			int countL = 0;
			int countR = 0;
			for (char c : arr) {
				if (c == ')') countR++;
				if (c == '(') countL++;
			}
			sb = new StringBuilder();
			if (countL < countR) {
				for (int i = 0; i < countR - countL; i++) {
					sb.append("(");
				}
			}
			sb.append(str);
			if (countR < countL) {
				for (int i = 0; i < countL - countR; i++) {
					sb.append(")");
				}
			}
			System.out.println(sb);


		}
	}
}