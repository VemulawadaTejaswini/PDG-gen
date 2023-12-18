import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] input = new int[10];

		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < input.length; i++) {
			System.out.println((i + 1) + "番目の読み込み");
			input[i] = sc.nextInt();
			System.out.println("値：" + input[i]);
		}

		for(int i = 0; i < input.length - 1; i++) {
			for(int j = i + 1; j <= input.length - 1;) {
				if(input[i] < input[j]) {
					int tmp = input[i];
					input[i] = input[j];
					input[j] = tmp;
				}
			}
		}

		for(int i = 0; i < 3; i++) {
			System.out.println(input[i]);
		}
	}
}