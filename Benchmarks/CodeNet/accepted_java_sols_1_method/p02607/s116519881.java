
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int N = Integer.parseInt(line);
		int[] a = new int[N+1];
		int count = 0;

		for(int i = 1; i <= N; i++) {
			line = sc.next();
			a[i] = Integer.parseInt(line);
		}

		for(int i = 1; i <= N; i++) {
			if(i % 2 == 1 && a[i] % 2 ==1) {
				count++;
			}
		}

		System.out.println(count);
	}

}
