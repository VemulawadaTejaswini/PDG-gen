import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt(), b = sc.nextInt(), x = sc.nextInt();
		System.out.println((x >= a && x <= a + b) ? "YES" : "NO");
	}

}