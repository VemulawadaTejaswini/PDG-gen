import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		long n     = Long.parseLong(scanner.nextLine());
		char[] ans = scanner.nextLine().toCharArray();
		int a = 0;

		for(int i = 0; i < n; i++) {

			if(i < n - 2 && ans[i] == 'A') {
				if(ans[i + 1] == 'B') {
					if(ans[i + 2] == 'C') {

						a++;
						i += 2;

					}
				}
			}
		}
		System.out.println(a);
	}
}