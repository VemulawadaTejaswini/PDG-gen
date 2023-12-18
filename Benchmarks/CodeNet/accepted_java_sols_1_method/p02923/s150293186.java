import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int size = sc.nextInt();
			int[] nums = new int[size];
			for (int i = 0; i < size; i++) {
				nums[i] = sc.nextInt();
			}
			int count = 0;
			int tempCount = 0;
			for (int i = 1; i < size; i++) {
				if (nums[i - 1] >= nums[i]) {
					tempCount++;
				} else {
					if (count < tempCount) {
						count = tempCount;
					}
					tempCount = 0;
				}
				if (i == size - 1) {
					if (count < tempCount) {
						count = tempCount;
					}
				}
			}
			System.out.println(count);
		}
	}
}
