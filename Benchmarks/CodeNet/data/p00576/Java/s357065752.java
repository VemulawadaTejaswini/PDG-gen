import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int koma[] = new int[n];
		for(int i = 0; i < n; i++) {
			koma[i] = sc.nextInt();
		}

		int m = sc.nextInt();
		for(int i = 0; i < m; i++) {
			int command = sc.nextInt();
			if(command == n) {
				if(koma[command - 1] != 2019) koma[command - 1]++;
			}
			else if(koma[command - 1] + 1 != koma[command]) {
				koma[command - 1]++;
			}
		}

		for(int i = 0; i < n; i++) System.out.println(koma[i]);
	}

}

