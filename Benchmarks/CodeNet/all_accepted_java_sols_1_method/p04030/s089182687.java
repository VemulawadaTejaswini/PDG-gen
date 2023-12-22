import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		List answer = new ArrayList<String>();

		for (char s : S.toCharArray()) {
			if (s == '0') answer.add("0");
			if (s == '1') answer.add("1");
			if (s == 'B' && answer.size() != 0) answer.remove(answer.size() - 1);
		}

		System.out.println(String.join("", answer));
	}
}
