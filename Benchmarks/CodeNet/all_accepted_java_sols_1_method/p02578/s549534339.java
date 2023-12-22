import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		long[] array = new long[N];

		long sum = 0;
		long num = 0;
		for(int i = 0; i < N; i++) {
			array[i] = scan.nextLong();
			if(i != 0) {
				num = array[i] - array[i-1];
				if(num < 0) {
					array[i] = array[i] + Math.abs(num);
					sum = sum + Math.abs(num);
				}
			}
		}
		System.out.println(sum);
	}

}