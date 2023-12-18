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
					int num = ((int) N.charAt(i)) - 48;
					judge += num;
					if(judge >= 9) {
						judge %= 9;
					}
					/*
					System.out.println("num " + num );
					System.out.println("judge " + judge);
					*/
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
