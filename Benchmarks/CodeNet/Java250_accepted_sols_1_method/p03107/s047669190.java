import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		String S = s.next();
		int n = 0, m = 0;
		for (int i = 0; i < S.length(); i++){
			if (S.substring(i, i + 1).equals("1")) n++;
			else m++;
		}
		System.out.println(2 * Math.min(n, m));
	}
}
