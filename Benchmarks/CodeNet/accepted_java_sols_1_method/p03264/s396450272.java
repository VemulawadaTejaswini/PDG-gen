import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();

		int oddCount;
		int evenCount;

		if (k % 2 == 0) {
			oddCount = k / 2;
			evenCount = oddCount;
		} else {
			oddCount = (k - 1) / 2;
			evenCount = oddCount + 1;
		}

		System.out.println(oddCount * evenCount);
	}

}
