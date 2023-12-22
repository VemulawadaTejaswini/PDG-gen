import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n [] = new int [3];

		for(int i = 0; i < 3; i++) {
			n[i] = sc.nextInt();
		}
		Arrays.sort(n);

		int ans = Math.abs(n[1]-n[0]);
		ans = ans + Math.abs(n[2]-n[1]);

		System.out.println(ans);
		sc.close();

	}

}
