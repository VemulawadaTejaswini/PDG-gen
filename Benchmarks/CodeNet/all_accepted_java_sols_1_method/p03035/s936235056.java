import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a >= 13 ? b : 12 >= a && a >= 6 ? b/2: 0);
	}
}