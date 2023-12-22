import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] l = new int[n];
		int current = 0;
		for(int i = 0 ; i < n ; i++) {
			l[i] = sc.nextInt();
		}
		int ans = 1;
		for(int i = 1 ; i < n + 1 ; i++) {
			current += l[i - 1];
			if(current <= x) ans++;
		}

		System.out.println(ans);

		sc.close();

	}

}
