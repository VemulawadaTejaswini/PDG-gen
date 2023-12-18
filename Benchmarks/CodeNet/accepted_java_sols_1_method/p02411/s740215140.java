import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int m = x.nextInt();
		int f = x.nextInt();
		int r = x.nextInt();
		int go = m + f;
		while( m !=  -1 || f != -1 || r != -1){
			if( m == -1 || f == -1 || go < 30){
				System.out.println("F");
			}else if( go >= 80){
				System.out.println("A");
			}else if( go >= 65){
				System.out.println("B");
			}else if( go >= 50 || r >= 50){
				System.out.println("C");
			}else if( go >= 30){
				System.out.println("D");
			}
			m = x.nextInt();
			f = x.nextInt();
			r = x.nextInt();
			go = m + f;
		}
	}
}