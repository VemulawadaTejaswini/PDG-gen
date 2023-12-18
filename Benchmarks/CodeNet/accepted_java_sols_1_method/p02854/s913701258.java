import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		int ans = 0;
		int f = 0;
		int b = c-1;
		int[] a = new int [c]; 
		for(int i = 0;i < c; i++) {
			a[i] = scan.nextInt();
		}
		for(int i = 0;i < c; i++) {
			
			if(ans <= 0) {
				ans += a[f];
				f++;
			}else {
				ans -= a[b];
				b--;
			}
		}
		System.out.println(Math.abs(ans));
	}
}
