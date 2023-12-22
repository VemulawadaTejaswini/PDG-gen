import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long money = 100;
		long x = sc.nextLong();
		int cnt = 0;

		while(true) {
			money = money + money / 100;
			cnt++;
			if(money >= x) break;
		}
		System.out.println(cnt);

	}

}