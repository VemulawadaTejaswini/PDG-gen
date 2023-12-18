import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int able = B/A;
		if(able > C) {
			System.out.println(C);
		}
		else {
			System.out.println(able);
		}
	}
}