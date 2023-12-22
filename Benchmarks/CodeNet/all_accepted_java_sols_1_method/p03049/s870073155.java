import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> s = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			s.add(sc.next());
		}
		int innerAB = 0;
		int leftCount = 0;
		int rightCount = 0;
		int bothCount = 0;
		for (String str : s) {
			for (int i = 0; i < str.length() - 1; i++) {
				if (str.charAt(i) == 'A' && str.charAt(i + 1) == 'B') {
					++innerAB;
				}
			}
			if (str.charAt(0) == 'B' && str.charAt(str.length() - 1) == 'A') {
				++bothCount;
			} else {
				if (str.charAt(0) == 'B') {
					++leftCount;
				}
				if (str.charAt(str.length() - 1) == 'A') {
					++rightCount;
				}
			}
		}
		int result = innerAB;
		while (true) {
			if (bothCount > 0 && (leftCount > 0 || rightCount > 0)) {
				--bothCount;
				++result;
			} else if (bothCount > 1) {
				--bothCount;
				++result;
			} else if (rightCount > 0 && leftCount > 0) {
				--rightCount;
				--leftCount;
				++result;
			} else if (bothCount > 0 && (rightCount > 0 || leftCount > 0)) {
				--bothCount;
				if (rightCount > 0) {
					++leftCount;
				} else {
					++rightCount;
				}
				++result;
			} else {
				break;
			}
		}
		System.out.println(result);
	}
}
