import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] s = new int[100];
		int n, i, sum, max, min;
		
		while (true) {
			for (i = 0; i < 100; i++)
				s[i] = 0;
			n = stdIn.nextInt();
			if (n == 0) break;
			
			for (i = 0; i < n; i++)
				s[i] = stdIn.nextInt();
			
			sum = 0;
			for (i = 0; i < n; i++)
				sum += s[i];
			
			max = s[0];
			min = s[0];
			for (i = 1; i < n; i++) {
				if (max < s[i]) max = s[i];
				if (min > s[i]) min = s[i];
			}
			
			sum = sum - max - min;
			
			System.out.println(sum / (n - 2));
		}
	}
}