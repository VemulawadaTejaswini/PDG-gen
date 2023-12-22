import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] temp = scanner.nextLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int k = Integer.parseInt(temp[1]);
		int q = Integer.parseInt(temp[2]);

		int[] mList = new int[n];
		Arrays.fill(mList, k - q);

		for(int i = 0; i < q; i++) {

			int winner = Integer.parseInt(scanner.nextLine());

			mList[winner - 1]++;

		}

		for(int i = 0; i < n; i++) {

			if(mList[i] > 0) {

				System.out.println("Yes");

			}else {
				System.out.println("No");
			}
		}



	}

}
