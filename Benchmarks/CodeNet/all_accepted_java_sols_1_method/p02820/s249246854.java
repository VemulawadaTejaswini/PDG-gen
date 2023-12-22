import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] t  = sc.nextLine().split(" ");
		int n       = Integer.parseInt(t[0]);
		int k       = Integer.parseInt(t[1]);

		String[] t1 = sc.nextLine().split(" ");
		int r       = Integer.parseInt(t1[0]);
		int s       = Integer.parseInt(t1[1]);
		int p       = Integer.parseInt(t1[2]);

		char[] x = sc.nextLine().toCharArray();
		char[] y = new char[n];
		int ans = 0;

		for(int i = 0; i < n; i++) {
			if(i >= k) {
				switch(x[i]){
					case 'r':
						if(y[i - k] != 'p') {
							ans += p;
							y[i] = 'p';
						}else {
							y[i] = 'z';
						}
						break;
					case 's':
						if(y[i - k] != 'r') {
							ans += r;
							y[i] = 'r';
						}else {
							y[i] = 'z';
						}
						break;
					case 'p':
						if(y[i - k] != 's') {
							ans += s;
							y[i] = 's';
						}else {
							y[i] = 'z';
						}
						break;
				}
			}else {
				switch(x[i]){
					case 'r':
						ans += p;
						y[i] = 'p';
						break;
					case 's':
						ans += r;
						y[i] = 'r';
						break;
					case 'p':
						ans += s;
						y[i] = 's';
						break;
				}
			}
		}
		System.out.println(ans);
	}
}
