import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt = 0;
		
		for (int i = 0; i<n; i++) {
			if (sc.nextInt() != i+1) {
				cnt += 1;
			}
			if (cnt > 2) {
				break;
			}
		}

		if (cnt > 2) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
}}