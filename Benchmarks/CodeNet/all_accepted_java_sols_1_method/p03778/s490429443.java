import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		if(min+w>=max) {
			System.out.println(0);
			return;
		} else {
			System.out.println(max - (min + w));
		}
	}
}