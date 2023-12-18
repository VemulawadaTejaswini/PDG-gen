import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		String s = a+b > c+d ? "Left" : "Right";
		if(a+b==c+d) {
			s = "Balanced";
		}
		System.out.println(s);
	}
}