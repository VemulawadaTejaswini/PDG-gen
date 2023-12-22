import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String luckyNum = sc.next();
		HashSet<String> lockNumSet = new HashSet<>();
		for (char first = '0'; first <= '9'; first++) {
			boolean firstFlag = false;
			int firstIndex = 0;
			for (int i = 0; i < n - 2; i++) {
				if (first == luckyNum.charAt(i)) {
					firstFlag = true;
					firstIndex = i;
					break;
				}
			}
			if (!firstFlag) {
				continue;
			}
			for (char second = '0'; second <= '9'; second++) {
				boolean secondFlag = false;
				int secondIndex = 0;
				for (int i = firstIndex + 1; i < n - 1; i++) {
					if (second == luckyNum.charAt(i)) {
						secondFlag = true;
						secondIndex = i;
						break;
					}
				}
				if (!secondFlag) {
					continue;
				}
				for (char third = '0'; third <= '9'; third++) {
					boolean thirdFlag = false;
					for (int i = secondIndex + 1; i < n; i++) {
						if (third == luckyNum.charAt(i)) {
							thirdFlag = true;
							break;
						}
					}
					if (thirdFlag) {
						String newLock = first + "" + second + "" + third;
						lockNumSet.add(newLock);
					}
				}
			}
		}
		System.out.println(lockNumSet.size());
	}
}
