import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());
		sc.close();
		sc = null;
		int a = -1;
		int b = -1;
		int c = -1;
		LABEL:for(i = 0; i <= n; i++) {
			for(j = 0; j <= n-i; j++) {
				if(i*10000 + j*5000 +(n-i-j)*1000 == y) {
					a=i;
					b=j;
					c=n-i-j;
					break LABEL;
				}
			}
		}
		System.out.println(""+a+" "+b+" "+c);
	}
}