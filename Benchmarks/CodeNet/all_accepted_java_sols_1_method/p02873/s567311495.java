import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		char[] s = sc.next().toCharArray();
		sc.close();
		long sum=0;
		long dai=0;
		long sho=0;
		if (s[0]=='<') {
			sho++;
		} else {
			dai++;
		}
		for (i = 1; i < s.length; i++) {
			if (s[i]=='<') {
				if(s[i-1]=='>') {
					long n = Math.max(sho, dai);
					long m = Math.min(sho, dai)-1;
					sum+=n*(n+1)/2+m*(m+1)/2;
//					out.printf("<:%d >:%d sum:%d%n", sho, dai, sum);
					sho=0;
					dai=0;
				}
				sho++;
			} else {
				dai++;
			}
		}
		long n = Math.max(sho, dai);
		long m = Math.min(sho, dai)-1;
		sum+=n*(n+1)/2+m*(m+1)/2;
//		out.printf("<:%d >:%d sum:%d%n", sho, dai, sum);
		out.println(sum);
	}
}
