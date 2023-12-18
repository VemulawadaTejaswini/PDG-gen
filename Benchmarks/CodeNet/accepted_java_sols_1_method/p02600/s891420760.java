import java.util.Scanner;

public class Main {
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc =  new Scanner(System.in);
		//case : 入力された数値を取得するとき
		int n = Integer.parseInt(sc.next());
		//case : 入力された文字列を取得するとき
//		String str = sc.next();
		if(400<=n && n<=599) {
			System.out.println(8);
		} else if (600<=n && n<=799) {
			System.out.println(7);			
		} else if (800<=n && n<=999) {
			System.out.println(6);			
		} else if (1000<=n && n<=1199) {
			System.out.println(5);			
		} else if (1200<=n && n<=1399) {
			System.out.println(4);			
		} else if (1400<=n && n<=1599) {
			System.out.println(3);			
		} else if (1600<=n && n<=1799) {
			System.out.println(2);			
		} else if (1800<=n && n<=1999) {
			System.out.println(1);			
		}
	}
	

}
