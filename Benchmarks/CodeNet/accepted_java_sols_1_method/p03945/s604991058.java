import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		String S = input.next();
		char cur = S.charAt(0);
		int ans = 0;
		for (int i = 1; i < S.length(); i++) {
			if (S.charAt(i)!=cur) {
				ans++;
				cur=S.charAt(i);
			}
		}
		System.out.println(ans);
	}
}