import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = "No";
		try {
			// TODO 自動生成されたメソッド・スタブ

			//数取得
			float D = sc.nextFloat();
			float T = sc.nextFloat();
			float S = sc.nextFloat();
			//System.out.println(D/S);

			if(D/S <= T) {
				answer = "Yes";
			}


		}finally {
			System.out.println(answer);
			sc.close();
		}

	}

}
