import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int []l = new int[3];
			for(int i = 0; i < 3; i++) {
				l[i] = sc.nextInt();
			}
			Arrays.sort(l);
			if(l[0] == 0) break;
			StringBuilder sb = new StringBuilder();
			int n = sc.nextInt();
			for(int i = 0; i < n; i++) {
				int r = sc.nextInt();
				if(l[0] * l[0] + l[1] * l[1] < 4 * r * r) {
					sb.append("OK");
				}else {
					sb.append("NA");
				}
				sb.append("\n");
			}
			System.out.print(sb.toString());
		}
		sc.close();
	}
}
