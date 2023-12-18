import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m, i, s, max, min;
		while(true) {
			s = 0;
			m = 0;
			n = sc.nextInt();
			min = sc.nextInt();
			max = sc.nextInt();
			if(n == 0 && min == 0 && max ==0) break;
			int a[] = new int[n];
			for(i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			for(i = min - 1; i < max; i++) {
				if(s <= a[i] - a[i + 1] || s < a[i + 1] - a[i]) {
					s = a[i] - a[i + 1];
					m = i + 1;
				}
			}
			System.out.println(m);
		}
		sc.close();
	}
}
