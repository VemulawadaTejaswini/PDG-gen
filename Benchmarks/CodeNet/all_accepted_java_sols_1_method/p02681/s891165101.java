
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S, T;
		char a[] = new char[13];
		S = sc.next();
		T = sc.next();



		String B = T.substring(0, S.length());

		if(S.equals(B)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}


	}

}
