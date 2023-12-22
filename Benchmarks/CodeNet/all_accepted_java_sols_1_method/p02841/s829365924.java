import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scan = new Scanner(System.in);
		int m1 = scan.nextInt();
		int d1 = scan.nextInt();
		int m2 = scan.nextInt();
		int d2 = scan.nextInt();

		if((m2-m1)==1) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
		
	}

}
