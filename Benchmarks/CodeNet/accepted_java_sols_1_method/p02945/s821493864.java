import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ここにコードを挿入
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b=sc.nextInt();
		int c=Math.max(a+b, a-b);
		int d=Math.max(c,a*b);
		System.out.println(d);
	}
}
