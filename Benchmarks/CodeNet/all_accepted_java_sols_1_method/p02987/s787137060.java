import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char [] sArray = s.toCharArray();
		int count = 0;
		for (int i = 1; i < 4; i++) {
			if (sArray[0] == sArray[i]) {
				count++;
				sArray[i] = 0;
			}
		}
		if (count != 1) {
			System.out.println("No");
			return;
		} else {
			for (int i = 1; i < 4; i++) {
				if (sArray[i] == 0) {
					continue;
				} else {
					for (int j = i + 1; j < 4; j++) {
						if (sArray[i] == sArray[j]) {
							System.out.println("Yes");
							return;
						}
					}
				}
			}
		}
		System.out.println("No");
	}
}