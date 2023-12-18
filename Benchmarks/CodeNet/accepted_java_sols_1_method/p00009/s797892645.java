import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			int c = 0;
			boolean[] p = new boolean[n+1];
			for (int i = 0; i <= n; i++) {
				p[i] = true;
			}
			int l = Double.valueOf(Math.sqrt((double)n)).intValue()+1;
			for (int i = 2; i <= l; i++) {
				for (int j = i*2; j <= n; j+=i) {
					p[j] = false;
				}
			}
			for (int i = 2; i <= n; i++) {
				if(p[i]){
					c++;
				}
			}
			System.out.println(c);
		}
	}
}