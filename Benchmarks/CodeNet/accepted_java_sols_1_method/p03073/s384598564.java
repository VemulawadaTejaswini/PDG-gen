import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int oddCount = 0;
		int evCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				if (arr[i] == '0') {
					oddCount++;
				} else {
					evCount++;
				}
			} else {
				if (arr[i] == '0') {
					evCount++;
				} else {
					oddCount++;
				}
			}
		}
		System.out.println(Math.min(oddCount, evCount));
	}
}
