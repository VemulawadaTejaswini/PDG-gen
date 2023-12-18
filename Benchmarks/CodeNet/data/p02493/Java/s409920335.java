import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] a = new int[length];

		for (int i = 0; i < length; i++){
			a[i] = sc.nextInt();
		}

		// 出力
		for (int i = length - 1; i >= 0; i--){
			System.out.printf("%d", a[i]);
			if (i != 0){
				System.out.printf(" ");
			}
		}
		System.out.printf("%n");

	}
}