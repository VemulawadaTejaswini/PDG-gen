import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(), W = sc.nextInt();
		int h = sc.nextInt(), w = sc.nextInt();
		System.out.println((H-h)*(W-w));
		sc.close();
	}
}