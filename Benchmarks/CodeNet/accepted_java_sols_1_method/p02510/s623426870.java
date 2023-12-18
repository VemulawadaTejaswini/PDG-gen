import java.util.*;

/* No.10023 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(!sc.hasNext("-")) {
			String str = sc.next();
			int n = sc.nextInt();
			for ( int i = 0; i < n; i++ ) {
				int index = sc.nextInt();
				str = str.substring(index)+str.substring(0,index);
			}
			System.out.println(str);
		}
	}
}