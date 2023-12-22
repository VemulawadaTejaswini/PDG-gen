import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n -1; i++) {
			a[scan.nextInt() - 1]++;
		}
		for (int i : a) {
			System.out.println(i);
		}
	}

}
