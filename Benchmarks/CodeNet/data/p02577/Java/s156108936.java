import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		String answer = "";

		try {

			String N = sc.next();
			int judge = 0;

			if(N.equals("0")) {
				answer = "Yes";
			}else {

				for(int i = 0; i < N.length(); i++) {
					judge += (int) N.charAt(i);
					judge %= 9;
				}
				if(judge == 0) {
					answer = "Yes";
				}else {
					answer = "No";
				}
			}

		}finally {
			sc.close();
			System.out.println(answer);
		}
	}

}
