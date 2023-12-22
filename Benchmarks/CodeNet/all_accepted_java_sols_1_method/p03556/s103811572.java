
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();

		while (true) {
			double d = Math.sqrt((double) n);
			String str = String.valueOf(d);
			if(str.endsWith(".0")){
				System.out.println(n);
				break;
			}
			n--;
		}

	}

}
