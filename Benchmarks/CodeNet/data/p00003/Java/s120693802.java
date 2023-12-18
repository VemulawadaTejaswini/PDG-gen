import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		int[] a = new int[3];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 3; j++) {
				a[j] = sc.nextInt();
			}
			Arrays.sort(a);
			if(a[0] * a[0] + a[1] * a[1] == a[2] * a[2]) {
				sb.append("YES");
			}else {
				sb.append("NO");
			}
			sb.append("\n");
		}
		sc.close();
		System.out.print(sb.toString());
	}
}
