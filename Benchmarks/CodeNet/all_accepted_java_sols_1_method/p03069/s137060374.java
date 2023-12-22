
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		String s = sc.next();

		int []w = new int [n+1];
		int []b = new int [n+1];
		
		for(int i = 1 ; i <= n ;i++) {
			w[i] = w[i-1];
			b[i] = b[i-1];
			if(s.charAt(i-1) == '#') {
				b[i]++;
			}
			else {
				w[i]++;
			}
		}
		
		int min = n+1;
		for(int i = 0 ; i <= n ;i++) {
			int temp = b[i] + w[n] - w[i];
			//System.out.println(temp);
			min = Math.min(min,temp);
		}
		
		System.out.println(min);
	}
}
