import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] s = sc.next().toCharArray();

		int R_count = 0;
		int B_count = 0;

		for( char word : s) {
			if(word == 'R') {
				R_count++;
			}else if(word == 'B') {
				B_count++;
			}
		}

		if(R_count > B_count) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}