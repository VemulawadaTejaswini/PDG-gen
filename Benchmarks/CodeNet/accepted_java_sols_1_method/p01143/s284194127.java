import java.util.*;
public class Main {
	static char[] l = new char[] {'q','w','e','r','t','a','s','d','f','g','z','x','c','v','b'};
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			int m = stdIn.nextInt();
			int p = stdIn.nextInt();
			if(n == 0 && m == 0 && p == 0) break;
			int[] a = new int[n];
			int b = 0;
			for(int i = 0; i < n; i++) {
				a[i] = stdIn.nextInt();
				b += a[i] * 100;
			}
			int c = (int)(b - b * p * 0.01);
			if(a[m-1] == 0) System.out.println("0");
			else {
				System.out.println(c / a[m-1]);
			}
			
		}
	}
}