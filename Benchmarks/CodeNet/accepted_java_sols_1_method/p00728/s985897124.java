import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int[] s = new int[n];
			int sum = 0;
			for (int i = 0; i < n; i++) {
				s[i] = sc.nextInt();
				sum += s[i];
			}
			int max = 0;
			int min = 0;
			for (int i = 0; i < n; i++) {
				if (s[max] < s[i])
					max = i;
				if (s[min] > s[i])
					min = i;
			}
			sum -= (s[max] + s[min]);
			int ave = sum / (n - 2);
			System.out.println(ave);
		}
	}
}