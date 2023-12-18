import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);

		int x = in.nextInt();
		int y = in.nextInt();

		if(y%2 == 0 && (2*x <= y && 4*x >= y)){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
