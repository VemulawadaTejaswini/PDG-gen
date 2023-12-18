import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int progA[] = new int[n];
		int progB[] = new int[n];
		for(int i = 0; i < n; i++) {
			progA[i] = sc.nextInt();
			progB[i] = progA[i];  //progBにもprogAと同じ値を入れておく
		}

		int q = sc.nextInt();

		for(int i = 0; i < q; i++) {
			int b = sc.nextInt();
			int m = sc.nextInt();
			int e = sc.nextInt();
			for(int k = 0; k < e - b; k++) {
				progB[b + ((k + (e - m)) % (e - b))] = progA[b + k];
			}
		}

		for(int j = 0; j < progB.length; j++) {
			if(j != 0) System.out.print(" ");
			System.out.print(progB[j]);
		}
		System.out.println();
	}

}

