import java.util.Scanner;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.next();
		scan.close();

		int sum = 0;

		for (int i = 0 ;i < N.length() ;i++ ) {
			sum += Integer.parseInt(N.substring(i,i+1));
		}

		System.out.println(sum%9 == 0?"Yes":"No");
	}
}
