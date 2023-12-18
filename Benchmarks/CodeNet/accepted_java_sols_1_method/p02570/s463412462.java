import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int D = scan.nextInt();
		int T = scan.nextInt();
		int S = scan.nextInt();
		scan.close();

		double num = (double)D / S;
		if(T >= num) {
			System.out.println("Yes");
		}else if(T < num) {
			System.out.println("No");

		}
	}

}
