import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int max = 0;
		int sub = 0;
		for(int i = 0; i < a.length; i++) {
			if( a[i] > max ) {
				max = a[i];
				sub = i;
			}
		}
		int ans = 0;
		for(int i = 0; i < a.length; i++) {
			if( i != sub ) {
				ans += a[i];
			}
		}
		System.out.println(ans);
	}
}