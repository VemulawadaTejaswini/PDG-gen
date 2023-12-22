import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int T = scanner.nextInt();
		double s = 0;
		int num = 0;
		
		s = (T + 0.5) / A;
		int si = (int)s;
		num = si * B;
		
		System.out.println(num);
	}
}
