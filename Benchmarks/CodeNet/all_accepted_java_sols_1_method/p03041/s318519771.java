import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		String ans = s.substring(0, k-1) + s.toLowerCase().charAt(k-1) + s.substring(k);
		System.out.println(ans);
	}
}
