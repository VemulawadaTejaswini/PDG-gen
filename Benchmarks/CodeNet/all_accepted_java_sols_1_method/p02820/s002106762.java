import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int r = sc.nextInt();
		int s = sc.nextInt();
		int p = sc.nextInt();
		sc.nextLine();
		char[] t = sc.nextLine().toCharArray();

		long answer = 0;
		for (int i = 0; i < k; i++) {
			for (int j = 0; i + (j * k) < t.length; j++) {
				int c = i + (j * k);
				int count = 1;
				while (i + ((j + 1) * k) < t.length && t[i + (j * k)] == t[i + ((j + 1) * k)]) {
					count++;
					j++;
				}

				if (t[c] == 'r') {
					// p score
					answer += ((count + 1) / 2) * p;
				} else if (t[c] == 's') {
					// r score
					answer += ((count + 1) / 2) * r;
				} else {
					// s score
					answer += ((count + 1) / 2) * s;
				}
			}
		}

		System.out.println(answer);
	}
}
