import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int k = sc.nextInt();
		int x = sc.nextInt();
		for (int i = -k + 1; i < k; i++) {
			System.out.print(x + i);
			if (i == k - 1) {
				System.out.println();
			}else {
				System.out.print(" ");
			}
		}
	}
}
