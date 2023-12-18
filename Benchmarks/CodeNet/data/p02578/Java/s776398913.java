import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		int[] array = new int[N];

		int sum = 0;
		int num = 0;
		for(int i = 0; i < N; i++) {
			array[i] = scan.nextInt();
			if(i != 0) {
				num = array[i-1] - array[i];
				if(num < 0) {
					array[i] = array[i] + Math.abs(num);
					sum = sum + Math.abs(num);
				}
			}
		}
		System.out.println(sum);
	}

}
