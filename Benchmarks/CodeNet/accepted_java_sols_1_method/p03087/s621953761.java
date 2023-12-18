import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String S = sc.next();
		
		int[] l = new int[Q];
		int[] r = new int[Q];
		
		for(int i = 0; i < Q; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		
		int[] sum = new int[N + 1];
		
		for(int i = 0; i < N - 1; i++) {
			sum[i + 2] = sum[i + 1];
			if(S.charAt(i) == 'A' && S.charAt(i + 1) == 'C') {
				sum[i + 2]++;
			} 
		}
		
		for(int i = 0; i < Q; i++) {
			int count = sum[r[i]] - sum[l[i] - 1];
			if(l[i] > 1) {
				if(S.charAt(l[i] - 1) == 'C' && S.charAt(l[i] - 2) == 'A') {
					count -= 1;
				}
			}
			System.out.println(count);
		}
	}
}
