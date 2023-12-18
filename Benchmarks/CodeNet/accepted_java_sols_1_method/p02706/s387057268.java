import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int days = sc.nextInt();
		int cnt = sc.nextInt();

		int needDays = 0;

		for(int i = 0; i < cnt; i++) {
			needDays += sc.nextInt();
		}

		if(days < needDays) {
			System.out.println(-1);
		} else {
			System.out.println(days - needDays);
		}
	}
}