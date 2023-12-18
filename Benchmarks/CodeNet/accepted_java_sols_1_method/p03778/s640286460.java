import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int a2 = a + W;
		int b2 = b + W;
		if(a <= b && b <= a2 || a <= b2 && b2 <= a2) {
			System.out.println(0);
		}else if(a > b2) {
			System.out.println(a - b2);
		}else if(a2 < b) {
			System.out.println(b - a2);
		}
	}
}