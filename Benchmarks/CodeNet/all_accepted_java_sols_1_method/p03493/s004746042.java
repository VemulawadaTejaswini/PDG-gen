
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		while(true) {
			if(n % 10 == 1)cnt++;
			n /= 10;
			if(n == 0) break;
		}
		System.out.println(cnt);
	}

}
