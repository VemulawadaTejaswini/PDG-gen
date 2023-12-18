import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();

		int sta =0;
		int end =100;
		sta=Math.max(a, c);
		end = Math.min(b, d);
		int show = end-sta;
		if(show<=0) {
			System.out.println(0);
		}else {
		System.out.println(end-sta);
	}
	}
}
