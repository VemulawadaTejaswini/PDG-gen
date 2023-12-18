import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n, s[], ave;
		int i;
		int max, min;
		Scanner sc = new Scanner(System.in);
		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			s = new int[n];
			max = 0;
			min = 0;
			ave = 0;
			for (i = 0; i < n; ++i) {
				s[i] = sc.nextInt();
				if (s[max] < s[i]) {
					max = i;
				}
				if (s[min] > s[i]) {
					min = i;
				}
				ave += s[i];
			}
			ave -= s[max] + s[min];
			ave /= (n - 2);
			System.out.println(ave);
		}
		sc.close();
	}

}
