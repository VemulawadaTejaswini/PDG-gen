import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int N = S.length();
		String zenhan = S.substring(0, (N-1)/2);
		String kouhan = S.substring((N+1)/2);
		String zenhan_r = new StringBuilder(zenhan).reverse().toString();
		String kouhan_r = new StringBuilder(kouhan).reverse().toString();		
		if(zenhan.equals(zenhan_r) && zenhan.equals(kouhan_r) && kouhan.equals(kouhan_r))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}