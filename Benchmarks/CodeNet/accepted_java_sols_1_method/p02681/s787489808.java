import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		long mod = (long)(1e9+7);
		Scanner input = new Scanner(System.in);
		String S = input.next();
		String T = input.next();
		int n = S.length();
		System.out.println((T.substring(0,n).equals(S)?"Yes":"No"));
	}
}