import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.Vector;

public class Main {
	static class FastScanner{//用于快速读入大量数据
		BufferedReader br;
		StringTokenizer st;
		public FastScanner(InputStream in) {
			br = new BufferedReader(new InputStreamReader(in),16384);
			eat("");
		}
		public void eat(String s) {
			st = new StringTokenizer(s);
		}
		public String nextLine() {
			try {
				return br.readLine();
			} catch (IOException e) {
				return null;
			}
		}
		public boolean hasNext() {
			while(!st.hasMoreTokens()) {
				String s = nextLine();
				if(s==null) return false;
				eat(s);
			}
			return true;
		}
		public String next() {
			hasNext();
			return st.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
	}

	static FastScanner cin = new FastScanner(System.in);//快读
	static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));//快速输出
	
	   public static void main(String args[]) {
		 int n;
		 n=cin.nextInt();
         
		 int ans=(1000-(n%1000))%1000;
		 out.println(ans);
		 out.flush();
	   }
}
