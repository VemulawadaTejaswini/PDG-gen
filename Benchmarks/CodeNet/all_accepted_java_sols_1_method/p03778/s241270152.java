import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int W = sc.nextInt();
        int a = sc.nextInt();
		int b = sc.nextInt();

		if (a+W < b) {
			System.out.println((b-(a+W)));
		} else if (a <= b && b <= a+W) {
			System.out.println("0");
		} else {
			System.out.println((a-(b+W)));
		}
		
		sc.close();
	}
}
