import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int  x=scan.nextInt();
		int  y=scan.nextInt();
		int  Z=0;
		if (x>=y) {
			while(true) {
				Z=x % y;
				if (Z==0) break;
				else {
					x = y;
				    y = Z;
					
				}
			}
			System.out.println(y);
		}
		else {
			while(true) {
				Z=y % x ;
				if (Z==0) break;
				else {
					y = x;
				    x = Z;
					
				}
			}
			System.out.println(x);
		}
	}
}

