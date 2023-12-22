import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int N = S.length();

		StringBuilder s = new StringBuilder();
		for(int i=0; i<N; i++) {
			s.append('x');
		}


		System.out.println(s.toString());
	}

}