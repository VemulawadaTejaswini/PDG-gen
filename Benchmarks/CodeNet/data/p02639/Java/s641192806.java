import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		for (int i=0;i<5;i++) {
			a[i] = sc.nextInt();
			if (a[i] == 0) {
				System.out.println(i+1);
			}
		}
	}
}
