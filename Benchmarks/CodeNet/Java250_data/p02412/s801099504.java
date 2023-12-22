import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		sb.append("");
		int n, x;
		while(true) {
			n = scan.nextInt();
			x = scan.nextInt();
			if (n == 0 && x == 0){break;}
			int i, j, k;
			int count = 0;
			for(i = 1; i <= n - 2; i++) {
				for(j = i+1; j <= n - 1; j++) {
					for(k = j+1; k <= n; k++) {
						if (i + j + k == x) {
							count += 1;
						}
					}
				}
			}
			sb.append(count + "\n");
		}
		System.out.print(sb);
	}
}