import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int arr[] = new int[30];
		int x;
		int y;
		int i = 0, temp = 0;
		do {
			x = stdin.nextInt();
			y = stdin.nextInt();
			if (x > y) {
				arr[i] = y;
				arr[i + 1] = x;
			} else {
				arr[i] = x;
				arr[i + 1] = y;
			}
			i += 2;
		} while (x != 0 && y != 0);

		for (i = 0; i < arr.length; i += 2) {
			if (arr[i] == 0 && arr[i + 1] == 0) {
				break;
			} else {
				System.out.println(arr[i] + " " + arr[i + 1]);
			}
		}
	}
}