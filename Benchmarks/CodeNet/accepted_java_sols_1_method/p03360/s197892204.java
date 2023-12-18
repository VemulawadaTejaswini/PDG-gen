import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int K = scanner.nextInt();

		//A,B,Cを昇順に並び替える
		int[] array = {A, B, C};
		Arrays.sort(array);

		/*
		for (int i : array) {
		    System.out.println(i);
		}
		*/

		//最大値をK回2倍し、他の2つの数を足す
		int add = array[2];
		for (int i = 0; i < K; i++) {
		    add *= 2;
		}
		System.out.println(add + array[0] + array[1]);
	}
}