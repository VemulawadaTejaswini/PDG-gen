
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		
		int []a = new int [n];
		
		for(int i = 0 ; i < m ;i++) {
			int p = Integer.parseInt(sc.next())-1;
			int q = Integer.parseInt(sc.next())-1;
			a[p]++;
			a[q]++;
		}
		
		for(int i = 0 ; i < n ;i++) {
			if(a[i] % 2 == 1) {
				System.out.println("NO");
				return;
			}
		}
		
		System.out.println("YES");

	}

}
