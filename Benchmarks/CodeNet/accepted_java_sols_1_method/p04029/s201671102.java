import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//人数の入力
		int N = sc.nextInt();
		//キャンディーの合計
		int sum = 0;
		//何個キャンディーをあげるか
		for(int i = 1; i <= N; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
