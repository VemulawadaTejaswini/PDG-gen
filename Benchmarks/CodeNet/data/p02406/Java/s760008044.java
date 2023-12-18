import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int z;
		for (int i = 3; i <= n; i++) {
			z = i;
			if(z % 3 == 0 ) {
				System.out.print(" " + i);
			}
			while (z != 0) {
				if (z % 10 == 3) {
					System.out.print(" " + i);
					break;
				}
				z /= 10;
			}
		}
		System.out.println("");
	}
}
