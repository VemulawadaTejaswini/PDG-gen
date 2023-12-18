import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		sc.close();

		//3人グループを作りまくると最大になる
		int ans = N / 3;
		System.out.println(ans);
	}
}
