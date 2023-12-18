import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int m = 0, f = 0, r = 0;
		while( true ){
			m = Integer.parseInt(scan.next());
			f = Integer.parseInt(scan.next());
			r = Integer.parseInt(scan.next());
			if( m == -1 && f == -1 && r == -1 ){
				break;
			}
			if( m == -1 || f == -1 || m + f < 30 ){
				System.out.println("F");
			}else if( m + f >= 80 ){
				System.out.println("A");
			}else if( m + f >= 65 ){
				System.out.println("B");
			}else if( m + f >= 50 || r >= 50 ){
				System.out.println("C");
			}else if( m + f >= 30 ){
				System.out.println("D");
			}
		}
		return;
	}
}