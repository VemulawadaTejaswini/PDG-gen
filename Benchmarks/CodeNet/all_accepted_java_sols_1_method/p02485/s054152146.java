import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while ( !sc.hasNext("0") ) {
			String data = sc.next();
			int sum = 0;
			for ( int i = 0; i < data.length(); i++ )
				sum += (int)data.charAt(i)-'0';
			System.out.println(sum);
		}
	}
}