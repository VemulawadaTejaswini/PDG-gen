import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		(new Main()).execute();
	}
	public void execute() {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int ans = checkAnswer(N) ;
		System.out.println(ans);
	}

	public int getAnswer(int N) {
		int ans = 0 ;

		if(N/10 == 0) {//1桁のとき
			ans = N ;
		}else if(N/100 == 0) {//2桁のとき
			ans = 9 ;
		}else if(N/1000 == 0) {//3桁のとき
			ans = 9 + (N - 99);
		}else if(N/10000 == 0) {//4桁のとき
			ans = 9 + (1000 - 99);
		}else {//5桁のとき
			ans = 9 + (1000 - 99) + (N - 9999);
		}

		return ans ;
	}

	public int checkAnswer(int N) {
		int ans = 0 ;
		for(int i = 1 ; i <= N ;i ++) {
			if(i < 10 || (100 <= i &&  i <= 999)|| (10000 <= i &&  i <= 99999)) {
				ans ++ ;
			}
		}
		return ans ;
	}
}
