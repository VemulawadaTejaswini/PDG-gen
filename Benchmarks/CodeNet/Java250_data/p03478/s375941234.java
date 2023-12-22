import java.util.*;

public class Main {

	public static void main(String[] args) {


		int N = 0;
		int A = 0;
		int B = 0;
		int sum = 0;
		int sumList = 0;
		List<Integer> intList = new ArrayList<Integer>();

		Scanner scanner = new Scanner(System.in);

		N = scanner.nextInt();
		A = scanner.nextInt();
		B = scanner.nextInt();

		for(int i = 1; i <= N ; i++) {
			int j = i;

			while(j >= 1) {
				sum = sum + (j % 10);
				j = (int) Math.floor(j / 10);
			}

			if(A <= sum && sum <=B) {
				sumList = sumList + i;
			}
			sum = 0;
		}
		System.out.println(sumList);
	}
}
