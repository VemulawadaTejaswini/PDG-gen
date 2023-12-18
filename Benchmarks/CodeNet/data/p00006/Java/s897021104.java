import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		String endStr; // ????????????????????????????????????
		endStr = new String("end");
		String str;
		str = sc.next();
		while (str.equals(endStr) != true) {
			StringBuilder strBul = new StringBuilder(str).reverse();
			System.out.println(strBul);
			str = sc.next();
		}
		sc.close();
	}
}