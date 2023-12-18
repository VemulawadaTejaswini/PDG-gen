import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] s = new int[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextInt();
		}

		int q = sc.nextInt();
		int[] t = new int[q];
		for (int i = 0; i < q; i++) {
			t[i] = sc.nextInt();
		}
		sc.close();

		int count = 0;
		for(int sagasu : t) {
			for(int sagasareru : s) {
				if(sagasu == sagasareru) {
					count++;
					break;
				}
			}
		}

		System.out.println(count);

	}
}