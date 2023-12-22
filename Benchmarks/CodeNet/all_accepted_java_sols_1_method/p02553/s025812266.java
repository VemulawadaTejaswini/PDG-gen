import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		long d = sc.nextInt();
		if((a>=0&&b>=0)&&(c>=0&&d>=0)) {
			System.out.println( b*d );
		}else if((a>=0&&b>=0)&&(c<0&&d>=0)) {
			System.out.println( b*d );
		}else if((a>=0&&b>=0)&&(c<0&&d<0)) {
			System.out.println( a*d );
		}
		
		else if((a<0&&b>=0)&&(c>=0&&d>=0)) {
			System.out.println( b*d );
		}else if((a<0&&b>=0)&&(c<0&&d>=0)) {
			if (a*c<b*d) {
				System.out.println( b*d );
			}else {
				System.out.println( a*c );
			}
		}else if((a<0&&b>=0)&&(c<0&&d<0)) {
			System.out.println( a*c );
		}
		
		else if((a<0&&b<0)&&(c>=0&&d>=0)) {
			System.out.println( c*b );
		}else if((a<0&&b<0)&&(c<0&&d>=0)) {
			System.out.println( a*c );
		}else if((a<0&&b<0)&&(c<0&&d<0)) {
			System.out.println( a*c );
		}
		sc.close();
	}
}