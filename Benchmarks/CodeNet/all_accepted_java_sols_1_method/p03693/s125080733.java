import java.util.*;
import java.math.BigDecimal;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String r = sc.next();
		String g = sc.next();
		String b = sc.next();
		int rgb = new Integer(r + g + b).intValue();
		if (rgb % 4 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}