import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		double d = scan.nextInt();
		int t = scan.nextInt();
		double s = scan.nextInt();
		
		double a = d/s;
		
		if(a <= t) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}

	}

}
