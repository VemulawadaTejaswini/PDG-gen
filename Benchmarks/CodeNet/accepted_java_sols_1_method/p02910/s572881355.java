import java.util.Scanner;

// https://atcoder.jp/contests/abc141/tasks/abc141_b
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine(); //Sの各文字は L, R, U, D
		sc.close();

		int length = S.length();
		boolean flag = true;
		for(int i=1;i<=length;i++) {
			int index = i%2;
			String firstS = S.substring(0,1);

			if(index==1) {
				if(firstS.equals("L")) {
					flag = false;
					break;
				}
			}else if(index==0) {
				if(firstS.equals("R")) {
					flag = false;
					break;
				}
			}
			S = S.substring(1);
		}

		if(flag) {
			System.out.println("Yes");

		}else {
			System.out.println("No");

		}
	}

}
