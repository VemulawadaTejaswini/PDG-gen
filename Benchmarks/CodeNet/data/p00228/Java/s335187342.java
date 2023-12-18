import java.util.*;

public class Main {
	public static void main ( String[] args ) {
		String[] ptn = {
			"0111111" , "1010010" , "1011011" , "1001111" , "1100110",
			"1101101" , "1111101" , "0100111" , "1111111" , "1101111"
		};
		Scanner sc = new Scanner(System.in);
		while ( sc.hasNext("-1") ) {
			int n = sc.nextInt();
			for ( int i = 0; i < n; i++ ) {
				int num = sc.nextInt();
				System.out.println(ptn[num]);
			}
		}
	}
}