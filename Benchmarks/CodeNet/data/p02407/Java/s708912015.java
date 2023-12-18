import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int a[] = new int[n]; //配列の宣言
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			for(int i = 1; i < n; i++) {
				System.out.print(a[n - i] + " ");
			}
			System.out.print(a[0] + "\n");
		}
	}
}

