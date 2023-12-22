import java.util.Scanner;

public class Main {
	public static int print(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				return i+1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}

		int result = print(arr);
		System.out.println(result);

	}

}
