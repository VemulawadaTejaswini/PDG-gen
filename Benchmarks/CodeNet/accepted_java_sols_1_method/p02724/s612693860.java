import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int fivehun_cnt = 0;
		int five_cnt = 0;
		fivehun_cnt = x / 500;
		five_cnt = (x - fivehun_cnt * 500) / 5;
		
		System.out.println((long)fivehun_cnt * 1000 + (long)five_cnt * 5);
	}
}
