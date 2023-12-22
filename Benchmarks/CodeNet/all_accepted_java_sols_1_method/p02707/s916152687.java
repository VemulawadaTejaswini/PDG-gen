import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] buka = new int[n];

		for(int i = 0; i < n - 1; i++) {
			buka[sc.nextInt() - 1]++;
		}

		for(int var : buka) {
			System.out.println(var);
		}

		sc.close();
	}
}
