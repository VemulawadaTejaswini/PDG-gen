import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int ans = Math.max(Math.max(a+b, a-b),a*b);
		System.out.println(ans);

	}

}
