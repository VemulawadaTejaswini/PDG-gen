import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int diceMax = length - 1;
		int count = 1;
		int maxCount = 1;
		int[] masu = new int[length];
		for (int i = 0; i < length; i++) {
			masu[i] = sc.nextInt();
		}
		for (int i = 0; i < length; i++) {
			if (masu[i] == 1) {
				count++;
			} else {
				count = 1;
			}
			if (count > maxCount) {
				maxCount = count;
			}
		}
System.out.println(maxCount);
	}
}

