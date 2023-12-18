import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count[] = new int[5];
		for (int i = 0; i < 3; ++i) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			count[a]++;
			count[b]++;
		}
		sc.close();
		String ans[] = { "YES", "NO" };
		int a = 0;

		for (int i = 1; i < 5; ++i) {
			if(count[i] == 3)a = 1;
		}
		System.out.println(ans[a]);
	}

}
