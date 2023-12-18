import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int x = N * B < C ? N * B : C;
		System.out.println(x);
	}
}
