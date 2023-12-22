import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		long x = scan.nextLong();
		long count500 = 0;
		long count5 = 0;
		
		
		if(x % 500 >= 0) {
			count500 = (x - x % 500) / 500;
			x %= 500;
		}
		if(x % 5 >= 0) {
			count5 = (x - x % 5) / 5;
			x %= 5;
			
		}
		/*
		System.out.println(count500);
		System.out.println(count5);
		System.out.println(x);
		*/
		
		long ans = 1000 * count500 + 5 * count5;
		
		System.out.println(ans);
	}

}
