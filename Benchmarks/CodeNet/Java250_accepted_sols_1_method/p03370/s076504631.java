import java.util.Scanner;

public class Main {
	static public void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		int[] mArray = new int[n];
		for (int i = 0; i < n; i++) {
			mArray[i] = scan.nextInt();
		}
		scan.close();

		int mMin = mArray[0];
		int xRest = x;
		for (int i = 0; i < n; i++) {
			xRest = xRest - mArray[i];
			if (mArray[i] < mMin) {
				mMin = mArray[i];
			}
		}
		System.out.println(mArray.length + xRest / mMin);
	}
}
