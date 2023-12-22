import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int a = sc.nextInt();
		int b = sc.nextInt();
		if ((a - b) % 2 == 0) {
			System.out.println(a - (a - b) / 2);
		} else {
			System.out.println("IMPOSSIBLE");
		}
	}
}