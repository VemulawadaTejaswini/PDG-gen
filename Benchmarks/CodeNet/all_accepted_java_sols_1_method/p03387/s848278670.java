import java.util.Scanner;

public class Main {
	static public void main(String[] args) {

		int[] intArray = new int[3];

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			intArray[i] = scan.nextInt();
		}
		scan.close();

		int max = 0;
		for (int i = 0; i < 3; i++) {
			if (max < intArray[i]) {
				max = intArray[i];
			}
		}
		int count = 0;

		while (intArray[0] != max || intArray[1] != max || intArray[2] != max) {
			count++;
			int maxCount = 0;
			for (int i = 0; i < 3; i++) {
				if (max == intArray[i]) {
					maxCount++;
				}
			}

			if (maxCount == 1) {
				for (int i = 0; i < 3; i++) {
					int target = intArray[i];
					if (target != max) {
						intArray[i] = ++target;
					}
				}
			} else {
				for (int i = 0; i < 3; i++) {
					int target = intArray[i];
					if (target != max) {
						intArray[i] = target + 2;
						if (max < target + 2) {
							max = target + 2;
						}
						break;
					}
				}
			}
		}
		System.out.println(count);

	}
}
