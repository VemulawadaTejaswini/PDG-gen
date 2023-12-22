import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());

		String[] tempList = scanner.nextLine().split(" ");
		int[] list = new int[n - 1];
		int[] resultList = new int[n];
		for(int i= 0; i < n - 1; i++) {
			list[i] = Integer.parseInt(tempList[i]);
		}

		for(int i : list) {
			int temp = i;
			resultList[i - 1] ++;
		}

		for(int i = 0; i < n; i++) {
			int result = 0;
			for(int j = resultList[i]; j > 0; j--) {
				result ++;
			}
			System.out.println(result);
		}

	}

}
