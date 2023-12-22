import java.util.Scanner;

public class Main {
	public static final String OK = "Yay!";
	public static final String NO = ":(";
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		if(e - a > k) System.out.println(NO);
		else System.out.println(OK);
	}
}