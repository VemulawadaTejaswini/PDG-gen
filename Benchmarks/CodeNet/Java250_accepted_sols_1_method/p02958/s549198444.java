import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int result = 0;

		for (int i = 0; i < N; i++) {
			int val = sc.nextInt();
			if (val != (i + 1)) {
				result++;
			}
		}

		if(result == 0 || result == 2){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}

}
