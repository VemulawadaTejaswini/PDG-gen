import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int d = 0;
		int cnt = 1;
		
		for (int i = 1; i <= n; i++) {
			int l = sc.nextInt();
			d += l;
			if (d <= x) {
				cnt++;
			} else {
				break;
			}
		}
		
		System.out.println(cnt);
		
		sc.close();
	}

}
