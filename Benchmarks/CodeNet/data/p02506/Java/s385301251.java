import java.util.*;

/* No.10022 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String needle = sc.next();
		int count = 0;
		while ( !sc.hasNext("END_OF_TEXT") )
			if ( needle.equals(sc.next()) ) count++;
		System.out.println(count);
	}
}