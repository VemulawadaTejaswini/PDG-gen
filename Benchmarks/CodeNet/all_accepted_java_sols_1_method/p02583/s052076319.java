
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		int []a = new int [n];
		
		for(int i = 0 ; i < n ;i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		int cnt = 0;
		
		for(int i = 0 ; i < n ;i++) {
			for(int j = i ; j < n ;j++) {
				for(int k = j ; k < n ; k++) {
					if(a[i] != a[j] && a[j] != a[k] && a[k] != a[i]) {
						int c = Math.abs(a[j]-a[k]);
						int d = a[j] + a[k];
						if(c < a[i] && a[i] < d) {
							cnt++;
						}
					}
				}
			}
		}
		
		System.out.println(cnt);
	}

}
