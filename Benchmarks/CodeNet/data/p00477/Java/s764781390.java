import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t = 0;
		for (int i = 0; i < 4; i++) {
			t += sc.nextInt();
		}
		System.out.println(t / 60);
		System.out.println(t % 60);
	}
}
