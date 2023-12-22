import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int kR = Integer.parseInt(sc.next());
		int q = Integer.parseInt(sc.next());
		int[] np = new int[n];

		for(int i=0; i<q; i++) {
			int a = Integer.parseInt(sc.next());
			np[a-1]++;
		}

		StringBuilder sb = new StringBuilder();
		for(int j=0; j<n; j++) {
			if(kR - q + np[j] > 0) {
				sb.append("Yes");
			} else {
				sb.append("No");
			}
			if(j < n - 1) {
				sb.append("\n");
			}
		}
		System.out.println(sb);

		sc.close();
	}
}
