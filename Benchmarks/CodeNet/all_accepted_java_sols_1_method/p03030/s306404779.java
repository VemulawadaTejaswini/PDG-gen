import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = sc.nextInt();

		int[] num = new int[n+1];
		String[] s = new String[n+1];
		int[] p = new int[n+1];

		for(int i=0; i<n; i++) {
			num[i] = i+1;
			s[i] = sc.next();
			p[i] = sc.nextInt();
		}

		num[n]=0;
		s[n]="0";
		p[n]=0;

		/* 辞書順にソート */
		for(int j=n; 0<j; j--) {
			for(int k=0; k<j; k++) {
				if(s[k].compareToIgnoreCase(s[k+1]) > 0) {
					num[n] = num[k];
					s[n] = s[k];
					p[n] = p[k];

					num[k] = num[k+1];
					s[k] = s[k+1];
					p[k] = p[k+1];

					num[k+1] = num[n];
					s[k+1] = s[n];
					p[k+1] = p[n];
					/* P順にソート */
				}if(s[k].compareToIgnoreCase(s[k+1]) == 0) {
					if(p[k]<p[k+1]) {
						num[n] = num[k];
						s[n] = s[k];
						p[n] = p[k];

						num[k] = num[k+1];
						s[k] = s[k+1];
						p[k] = p[k+1];

						num[k+1] = num[n];
						s[k+1] = s[n];
						p[k+1] = p[n];
					}
				}
			}
		}

		for(int i=0; i<n; i++) {
			System.out.println(num[i]);
		}
	}
}
