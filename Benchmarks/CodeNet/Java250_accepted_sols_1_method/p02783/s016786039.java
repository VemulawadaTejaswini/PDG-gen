import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int A = sc.nextInt();
		int waru = H / A;
		int amari = H % A;
		if (amari != 0) {
			int kasan = waru + 1;
			waru = kasan;
		}
		System.out.println(waru);
		sc.close();
	}
}