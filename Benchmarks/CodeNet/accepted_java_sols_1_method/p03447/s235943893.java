import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int m = 0,n = 0,l = 0;
		if(x >= a) {
			m = x - a;
			n = m / b;
			l = m - (n * b);
		System.out.println(l);
		}else if(m == b) {
			System.out.println(0);
		}
	}
}
