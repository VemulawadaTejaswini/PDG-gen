import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[7];
		int s;
		int b = 1;
		for (int i = 0; i < 7; i++) {
			s = sc.nextInt();
			a[i] = s;
		}
		for (int j = 0; j < 6; j++) {
			System.out.println("Case " + b + ": " + a[j]);
			b++;
		}
		sc.close();
	}
}

