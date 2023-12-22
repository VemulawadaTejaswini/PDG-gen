
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long sumN = 0;

		for(long i = 1; i <= N; i++ ) {
			if(i % 3 == 0 || i % 5 == 0) {

			}else {
				sumN = sumN + i;
			}
		}

		System.out.println(sumN);
	}

}
