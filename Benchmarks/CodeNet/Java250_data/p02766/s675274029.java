import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 1;

		for(int i = 0;i < 10000;i++) {
			if(n < k) {
				break;
			}
			n /= k;
			count++;
		}
		System.out.println(count);
	}

}
