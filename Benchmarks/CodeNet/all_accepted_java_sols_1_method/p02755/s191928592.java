import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		for ( int i=0; i<=1000; i++ ) {
			int c = (int)(i*1.08);
			int d = (int)(i*1.10);
			if ( c == i+a && d == i+b ) {
				System.out.println(i);
				System.exit(0);
			}
		}
		System.out.println(-1);
	}
}