import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int prog[] = new int[n];
		for(int i = 0; i < n; i++) {
			prog[i] = sc.nextInt();
		}

		int q = sc.nextInt();
		for(int i = 0; i < q; i++) {
			int b = sc.nextInt();
			int e = sc.nextInt();
			int k = sc.nextInt();
			int count = 0;
			for(int j = b; j < e; j++) {
				if(prog[j] == k) count++;
			}
			System.out.println(count);
		}
	}

}


