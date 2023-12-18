/* package whatever; // don't place package name! */

import java.util.*;
import java.util.regex.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main(String[] args) {
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				String line = in.readLine().replaceAll(" ", "");
				String[] split = line.split(":");
				int p = Integer.parseInt(split[0]);
				if (p == 0)
					break;
				int[] rep = new int[p];
				for (int i = 0; i < p; i++) {
					rep[i] = 1;
					for (int j = 0; j < p - 2; j++) {
						rep[i] *= i;
						rep[i] %= p;
					}
				}
				try {
					StringBuffer expression = new StringBuffer(split[1]);
					while (true) {
						Matcher matcher = parPattern.matcher(expression);
						if (!matcher.find())
							break;
						StringBuffer buffer = new StringBuffer();
						do {
							int val = eval(matcher.group(1), p, rep);
							matcher.appendReplacement(buffer, val + "");
						} while (matcher.find());
						matcher.appendTail(buffer);
						expression = buffer;
					}
					int val = eval(expression.toString(), p, rep);
					System.out.println(split[1]+" = " +val + " (mod " + p + ")");
				} catch (IllegalArgumentException e) {
					System.out.println("NG");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static Pattern parPattern = Pattern.compile("\\(([^()]*)\\)");
	private static Pattern pattern2 = Pattern.compile("([+-])([^+-]+)");
	private static Pattern pattern3 = Pattern.compile("([*/])([0-9]+)");

	private static int eval(String expression, int p, int[] rep) {
		Matcher matcher = pattern2.matcher("+" + expression);
		int ans = 0;
		while (matcher.find()) {
			int result = eval2(matcher.group(2), p, rep) % p;
			if (matcher.group(1).equals("+")) {
				ans += result;
			} else {
				ans += p - result;
			}
			ans %= p;
		}
		return ans;
	}

	private static int eval2(String expression, int p, int[] rep) {
		Matcher matcher = pattern3.matcher("*" + expression);
		int ans = 1;
		while (matcher.find()) {
			int num = Integer.parseInt(matcher.group(2));
			if (matcher.group(1).equals("*")) {
				ans *= num;
			} else {
				if (num == 0)
					throw new IllegalArgumentException();
				ans *= rep[num];
			}
			ans %= p;
		}
		return ans;
	}
}