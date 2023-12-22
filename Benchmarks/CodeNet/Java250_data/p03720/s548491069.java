
import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class Main {
	public static void main(String[] args) {
		FastReader r = new FastReader();		
		int[] arr = r.ria();
		int[][] pairs = new int[arr[1]][2];
		for(int i = 0;i<pairs.length; i++)
			pairs[i] = r.ria();
		Map<Integer,Integer> map = new TreeMap<>();
		for(int i = 0; i<pairs.length; i++)
		{
			if(pairs[i][0] == pairs[i][1]) continue;
			map.put(pairs[i][0], map.getOrDefault(pairs[i][0], 0)+1);
			map.put(pairs[i][1], map.getOrDefault(pairs[i][1], 0)+1);
		}
		for(int i = 1; i<=arr[0]; i++)
			print(map.getOrDefault(i, 0));
	}

	public static void rolling(int[] arr) {
		if (arr.length < 2)
			return;
		for (int i = 1; i < arr.length; i++)
			arr[i] += arr[i - 1];
	}
	
	public static void rolling(long[] arr) {
		if (arr.length < 2)
			return;
		for (int i = 1; i < arr.length; i++)
			arr[i] += arr[i - 1];
	}

	public static void reverse(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	}
	
	public static String al(String s) {
		return s + "\n";
	}

	public static void print(String s) {
		System.out.println(s);
	}

	public static void print(long s) {
		System.out.println(s);
	}

	public static void print(int s) {
		System.out.println(s);
	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		int ri() {
			return Integer.parseInt(str());
		}

		long rl() {
			return Long.parseLong(str());
		}

		double rd() {
			return Double.parseDouble(str());
		}

		String str() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

		String[] rsa() {
			return str().split(" ");
		}

		int[] ria() {
			String[] s = rsa();
			int[] arr = new int[s.length];
			for (int i = 0; i < arr.length; i++)
				arr[i] = Integer.parseInt(s[i]);
			return arr;
		}

		long[] rla() {
			String[] s = rsa();
			long[] arr = new long[s.length];
			for (int i = 0; i < arr.length; i++)
				arr[i] = Long.parseLong(s[i]);
			return arr;
		}

		char[] rca() {
			String s = str();
			char[] arr = new char[s.length()];
			for (int i = 0; i < arr.length; i++)
				arr[i] = s.charAt(i);
			return arr;
		}
		
		String[] rsaml(int m) {
			String[] arr = new String[m];
			for (int i = 0; i < arr.length; i++)
				arr[i] = str();
			return arr;
		}

		int[] riaml(int m) {
			int[] arr = new int[m];
			for (int i = 0; i < arr.length; i++)
				arr[i] = Integer.parseInt(str());
			return arr;
		}

		long[] rlaml(int m) {
			long[] arr = new long[m];
			for (int i = 0; i < arr.length; i++)
				arr[i] = Long.parseLong(str());
			return arr;
		}
	}
}

class Node {
	public int val;
	public boolean visited;
	public Node(int v) { val=v; }
}