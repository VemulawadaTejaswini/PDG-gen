import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean ok = false;
		for(int i = 1; i < 4; i++) {
			if((a * b * i) % 2 == 1) ok  = true;
		}
		System.out.println(ok ? "Yes" : "No");
	}
}
