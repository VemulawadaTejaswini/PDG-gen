import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		int answer = 0;
		if(k >= a) {
			answer += a;
			k -=a;
		}else {
			answer = k;
			System.out.println(answer);
			return;
		}
		if(k >= b) {
			k -=b;
		}else {
			System.out.println(answer);
			return;
		}

		answer -= k;
		System.out.println(answer);

	}
}