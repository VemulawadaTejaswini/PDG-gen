import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = Integer.parseInt(sc.next());
		sc.close();

		//31日の24時間を考慮
		int ans  = 24 + (24 - M);
		System.out.println(ans);
	}
}