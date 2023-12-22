import java.util.*;

/* No.10027 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),
		taro = 0 , hanako = 0;
		for ( int i = 0; i < n; i++ ) {
			String t = sc.next(), h = sc.next();
			if ( t.compareTo(h) < 0 ) hanako+=3;
			else if ( t.compareTo(h) > 0 ) taro += 3;
			else {
				taro++; hanako++;
			}
		}
		System.out.println(taro+" "+hanako);
	}
}