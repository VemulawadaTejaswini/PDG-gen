import java.util.Scanner;
import java.util.*;
public class Main {
	public static String S;
	public static String T;
	public static int sub = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		S = scan.next();
		T = scan.next();
		System.out.println(search());
	}

	private static int search() {
		for (int i = 0;i <= S.length() - T.length() ;i++ ) {
			int count = 0;
			for (int j = 0;j < T.length() ;j++ ) {
				String s_i = S.substring(i + j,i + j + 1);
				String t_i = T.substring(j,j + 1);
				if (!s_i.equals(t_i)) count++;
			}
			sub = Math.min(sub,count);
		}
		return sub;
	}

}
