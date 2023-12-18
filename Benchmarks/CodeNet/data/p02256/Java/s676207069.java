import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		while( a != b ){
			if( a < b ){
				b -= a;
			} else if( a > b ){
				a -= b;
			}
		}
		
		System.out.println(a);
	}
}