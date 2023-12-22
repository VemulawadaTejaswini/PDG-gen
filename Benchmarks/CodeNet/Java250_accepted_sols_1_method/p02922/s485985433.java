import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		sc.close();

		int ans = 0;
		int num = 1;
		while(num < B) {
			ans++;
			num = A * ans - (ans - 1);
		}
		System.out.println(ans);
	}

}
