import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int w = sc.nextInt();
		String ans = s <= w ? "unsafe" : "safe";
		System.out.println(ans);
	}
}
