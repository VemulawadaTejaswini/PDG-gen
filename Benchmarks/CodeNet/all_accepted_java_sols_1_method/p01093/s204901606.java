import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i, j, s;
		while(true) {
			s = 0;
			int m[] = {0, 0};
			n = sc.nextInt();
			if(n == 0)	break;
			int a[] = new int[n];
			for(i = 0; i < n; i ++) {
				a[i] = sc.nextInt();
				if(a[i] > s) s = a[i];
			}
			for(i = 0; i < n; i ++) {
				for(j = 0; j < n; j ++) {
					if(i == j) continue;
					if(a[j] - a[i] < 0) {
						m[0] = a[i];
						m[1] = a[j];
					}else {
						m[0] = a[j];
						m[1] = a[i];
					}
					if(s > m[0] - m[1]) {
						s = m[0] - m[1];
					}
				}
			}
			System.out.println(s);
		}
		sc.close();
	}

}
