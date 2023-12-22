import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[m];
		for(int i = 0 ; i < m ; i++) a[i] = sc.nextInt();
		int first = 0;
		int last = 0;
		int now = x;
		while(now != 0) {
			now--;
			for(int i = 0 ; i < m ; i++) {
				if(a[i] == now) first++;
			}
		}
		now = x;
		while(now != n) {
			now++;
			for(int i = 0 ; i < m ; i++) {
				if(a[i] == now) last++;
			}
		}
		System.out.println(Math.min(first, last));
	}
}
