import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int progA[] = new int[n];
		for(int i = 0; i < n; i++) {
			progA[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		int temp;

		for(int i = 0; i < q; i++) {
			int b = sc.nextInt();
			int e = sc.nextInt();
			for(int j = b; j < b + (e - b) / 2; j++) {
				temp = progA[j];
				progA[j] = progA[e + b - 1 - j];
				progA[e + b - 1 - j] = temp;
			}
		}

		for(int j = 0; j < progA.length; j++) {
			if(j != 0) System.out.print(" ");
			System.out.print(progA[j]);
		}
		System.out.println();
	}

}

