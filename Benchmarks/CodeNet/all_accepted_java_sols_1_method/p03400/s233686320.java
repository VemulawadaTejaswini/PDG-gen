import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int day = sc.nextInt();
		int remain = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		int result = remain + num;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] <= day) {

				if ((day % arr[i]) == 0) {
					result--;
				}
				result += (day / arr[i]);
			}
		}

		System.out.println(result);
	}
}