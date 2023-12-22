import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();
		if (X == 3 || X == 5 || X == 7) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
