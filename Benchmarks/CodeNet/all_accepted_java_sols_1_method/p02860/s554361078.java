
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String S = sc.next();

		String a = S.substring(0, N/2);
		String b = S.substring(N/2);


		if(a.equals(b)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}


	}

}
