
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long money = 100;
		long cnt = 0;
		while(money < x) {
			cnt++;
			money *= 1.01;
		}
		System.out.println(cnt);

	}

}
