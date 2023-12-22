
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = Integer.parseInt(sc.next());
			int i, L = 0, R = 0;
			int[] a = new int[5001];
			if(n == 0) {
				break;
			}
			for(i = 0; i < n; i++) {
				a[i] = Integer.parseInt(sc.next());
			}
			L = R = a[0];
			for(i=1; i<n; i++){
				if( L >= R ) ; else L = R;
				if( R + a[i] < a[i] ) R = a[i]; else R = R + a[i];
			}
			if( L > R) {
				System.out.println(L);
			}else {
				System.out.println(R);
			}
		}
		sc.close();


	}

}

