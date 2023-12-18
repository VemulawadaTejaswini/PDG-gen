import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int res = 30000;
		res = Math.min(res, a+b);
		res = Math.min(res, b+c);
		res = Math.min(res, c+a);
		System.out.println(res);
	}
}
