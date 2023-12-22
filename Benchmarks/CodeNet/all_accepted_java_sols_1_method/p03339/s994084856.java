import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		char[] s = sc.next().toCharArray();
		int[] e = new int[s.length];
		int[] w = new int[s.length];
		e[0] = s[0] == 'E' ? 1 : 0;
		w[0] = s[0] == 'W' ? 1 : 0;
		for (int i = 1; i < N; i++) {
			e[i] = e[i-1] + (s[i] == 'E' ? 1 : 0);
			w[i] = w[i-1] + (s[i] == 'W' ? 1 : 0);
		}
		
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			int sum = 0;
			if (i != 0) {
				sum += w[i-1];
			}
			
			if (i != N-1) {
				sum += e[N-1] - e[i];
			}
			
			min = Math.min(min, sum);
		}
		
		System.out.println(min);
	}
	
}
