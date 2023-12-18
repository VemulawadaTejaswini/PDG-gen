import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[100];
		int num = 0;
		int count = 0;
		int temp;

		// 入力
		num = scan.nextInt();
		for(int i = 0; i < num; i++) {
			array[i] = scan.nextInt();
		}

		// ソート
		for(int i = 0; i < num - 1; i++) {
			for(int j = num - 1; j >= i + 1; j-- ) {
				if(array[j-1] > array[j]) {
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
					count++;
				}
			}

		}

		// 出力
		for(int i = 0; i < num; i++) {
			if(i != 0) {
				System.out.print(" ");
			}
			System.out.print(array[i]);
		}
		System.out.println("");
		System.out.println(count);

	}
}
