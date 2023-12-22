import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int d = scanner.nextInt();
		int x = scanner.nextInt();
		// i nin me
		for(int r = 0; r < n; r++) {
			int a = scanner.nextInt();
		// choco + 
			for(int i = 0; i < d; i += a) {
				x++;
			}
		}
		System.out.println(x);
	}

}