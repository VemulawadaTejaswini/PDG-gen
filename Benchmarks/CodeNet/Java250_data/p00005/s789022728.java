

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author Lin
 * @version 1.0
 * @date 2020/8/5 15:43
 */
public class Main
{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext())
		{
			long n = scanner.nextLong();
			long m = scanner.nextLong();

			long gcd = gcd(Math.max(n, m), Math.min(m, n));
			long lcm = n * (m / gcd);
			System.out.println(gcd + " " + lcm);
		}
	}

	private static long gcd(long n, long m)
	{
		if (n%m == 0)
		{
			return m;
		}
		return gcd(m, n % m);
	}

	static class Reader {
		static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		static StringTokenizer tokenizer = new StringTokenizer("");
		static String nextLine() throws IOException
		{// 读取下一行字符串
			return reader.readLine();
		}
		static String next() throws IOException {// 读取下一个字符串
			while (!tokenizer.hasMoreTokens()) {
				tokenizer = new StringTokenizer(reader.readLine());
			}
			return tokenizer.nextToken();
		}

		static int nextInt() throws IOException {// 读取下一个int型数值
			return Integer.parseInt(next());
		}
		static long nextLong() throws IOException {// 读取下一个int型数值
			return Long.parseLong(next());
		}
		static double nextDouble() throws IOException {// 读取下一个double型数值
			return Double.parseDouble(next());
		}
	}
}

