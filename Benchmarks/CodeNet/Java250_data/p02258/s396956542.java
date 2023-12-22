import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int min = scan.nextInt();
		int r = scan.nextInt();
		int maxLong = r - min;
		if (min > r){
			min = r;
		}
		for (int i = 0; i < N - 2; i++) {
			r = scan.nextInt();
			if (maxLong < r - min) {
				maxLong = r - min;
			}
			if (r < min) {
				min = r;
			}
		}
		System.out.println(maxLong);
	}
}