import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = false;
		for(int i = 1; i <= 9; i++) {
			int a = n/i;
			if(a*i == n && a < 10 && a > 0) {
				flag = true;
				break;
			}
		}
		System.out.println(flag ? "Yes" : "No");
		sc.close();
	}
}