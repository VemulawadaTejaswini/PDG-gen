import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		int score = 0;
		
		while(a > 0 && k > 0) {
			score++;
			k -= 1;
			a -= 1;
		}
		while(b > 0 && k > 0) {
			k -= 1;
			b -= 1;
		}
		while(c > 0 && k > 0) {
			score--;
			k -= 1;
			c -= 1;
		}
		System.out.println(score);
	}

}
