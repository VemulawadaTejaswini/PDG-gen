import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i, n;
		try (Scanner sc = new Scanner(System.in)) {
			while(true) {
				double average = 0, alpha = 0;
				n = sc.nextInt();
				if(n == 0) {
					break;
				}
				int[] s = new int[n];
				for(i = 0; i < n; i++) {
					s[i] = sc.nextInt();
					average += s[i];
				}
				average /= n;
				for(i = 0; i < n; i++) {
					alpha += (s[i] - average) * (s[i] - average);
				}
				System.out.println(Math.sqrt(alpha / n));
			}
			
		}
	}
}

