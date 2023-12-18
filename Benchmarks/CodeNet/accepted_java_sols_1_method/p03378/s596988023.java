import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int x = scan.nextInt();
		int a[] = new int[m];
		int row[] = new int[n+1];
		int rightsum = 0;
		int leftsum = 0;

		for (int num=0; num < m; num++) {
			a[num] = scan.nextInt();
		}

		for (int i=0; i < m; i++) {
			row[a[i]] = 1;
		}

		int rightnum = n - x;

		for (int j = 0; j <= rightnum; j++) {
			rightsum += row[x + j];
		}

		for (int leftnum = x; leftnum >= 0;leftnum--) {
			leftsum += row[leftnum];
		}

		int sum = (rightsum > leftsum)?leftsum : rightsum;

		System.out.println(sum);

		scan.close();

	}

}
