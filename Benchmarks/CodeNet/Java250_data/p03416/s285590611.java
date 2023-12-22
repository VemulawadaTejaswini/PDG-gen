import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int cnt = 0;
		for(int i = a; i <= b; i++) {
			int num = i;
			int dig1 = num % 10;
			int dig2 = (num / 10) % 10;
			int dig4 = (num / 1000) % 10;
			int dig5 = num / 10000;
			if( dig1 == dig5 && dig2 == dig4)
				cnt++;
		}
		System.out.println(cnt);
	}
}
