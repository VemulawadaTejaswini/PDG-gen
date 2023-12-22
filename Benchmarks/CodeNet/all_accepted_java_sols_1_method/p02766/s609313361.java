import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();

		// Nの値をK新法で割ったあまりが各桁の値となる
		int cnt = 0;
		do{
			n /= k;
			cnt++;
		}while(n!=0);
		System.out.println(cnt);
	}
}
