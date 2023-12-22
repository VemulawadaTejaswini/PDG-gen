import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		int t = c/b;
		if ( c%b!=0 ) t++;

		int u = a/d;
		if ( a%d!=0 ) u++;

		if ( t<=u ) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}