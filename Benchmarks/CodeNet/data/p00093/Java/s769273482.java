import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0093
public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean isFirst = true;
		while (true) {
			int a, b;
			a = sc.nextInt();
			b = sc.nextInt();
			if (a == 0 && b == 0) break;
			if (isFirst) 
				isFirst = false;
			else
				System.out.println();
			
			boolean find = false;
			for (int y = a; y <= b; y++) {
				boolean isLeap = false;
				if (y % 4 == 0) {
					if (y % 100 != 0) {
						if (y % 4 == 0)
							isLeap = true;
					} else {
						isLeap = true;
					}
				}
				
				if (isLeap) {
					find = true;
					System.out.println(y);
				}
			}
			
			if (!find)
				System.out.println("NA");
		}
	}
}