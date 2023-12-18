import java.util.Scanner;

public class Main {

	public static void printArray(int num, int[] array) {
		for(int i = 0; i < num; i++) {
			if(i != 0) {
				System.out.print(" ");
			}
			System.out.print(array[i]);
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[100];
		int num;
		int j;
		int v;

		// 入力
		num = scan.nextInt();
		for(int i = 0; i < num; i++) {
			array[i] = scan.nextInt();
		}

		// ソート＆出力
		printArray(num, array);
		for(int i = 1; i < num; i++) {
			v = array[i];
			j = i - 1;
			while(j >= 0 && array[j] > v) {
				array[j + 1] = array[j];
				j--;
			}
			array[j+1] = v;
			printArray(num, array);
		}


	}
}
