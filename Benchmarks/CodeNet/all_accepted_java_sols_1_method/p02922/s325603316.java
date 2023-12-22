import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int cur = 1;
		int res = 0;
		while (cur < b) {
			cur = cur - 1 + a;
			res++;
		}
		System.out.println(res);
		sc.close();
	}

}
