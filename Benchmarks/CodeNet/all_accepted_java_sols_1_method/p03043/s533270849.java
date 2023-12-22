import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		double win = 0;
		for(int i=1;i<=n;i++) {
			int m=i;
			int j;
			for(j=1;m<k;j++) {
				m = m*2;
			}
			win = win + Math.pow(0.5, j-1);
		}
		win = win/n;

		System.out.println(win);
	}
}
