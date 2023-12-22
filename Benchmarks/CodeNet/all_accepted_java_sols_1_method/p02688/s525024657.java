
import java.util.Scanner;

public class Main {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		
		int []p = new int [n];
		
		for(int i = 0 ; i < k; i++) {
			int d = Integer.parseInt(sc.next());
			for(int j = 0 ; j < d ;j++) {
				int a = Integer.parseInt(sc.next())-1;
				p[a]++;
			}
		}
		
		int cnt = 0;
		for(int i = 0 ; i < n ;i++) {
			if(p[i] == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
				
	}

}
