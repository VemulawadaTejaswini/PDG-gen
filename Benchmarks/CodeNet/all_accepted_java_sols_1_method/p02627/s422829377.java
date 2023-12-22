import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		String a = sc.next();

		if( Character.isUpperCase( a.charAt( 0 ) )) {
			System.out.println( "A" );
		} else {
			System.out.println( "a" );
		}
	}
}