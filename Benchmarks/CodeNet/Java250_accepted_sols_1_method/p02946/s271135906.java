import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int X = sc.nextInt();
		sc.close();
		int[] r = new int[(K * 2) - 1];
		int x = X - K + 1;
		for(int i = 0; i < r.length; i++) {
			r[i] = x;
			x++;
		}
		for(int i = 0; i < r.length; i++) {
			System.out.print(r[i] + " ");
		}
	}
}
