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
		 int t;
		 t=cin.nextInt();
		 HashMap<String,Integer>mp=new HashMap<>();
         while(t-->0) {
		     String str;
		     str=cin.next();
		     if(mp.containsKey(str)) {
		     mp.put(str,mp.get(str)+1);
		     }
		     else {
		    	 mp.put(str, 1);
		     }
        	 
		 }
         if(mp.containsKey("AC")) {
         out.println("AC x "+mp.get("AC"));
         }
         else {
        	 out.println("AC x 0");
         }
         if(mp.containsKey("WA")) {
             out.println("WA x "+mp.get("WA"));
             }
             else {
            	 out.println("WA x 0");
            }
         if(mp.containsKey("TLE")) {
             out.println("TLE x "+mp.get("TLE"));
             }
             else {
            	 out.println("TLE x 0");
             }if(mp.containsKey("RE")) {
                 out.println("RE x "+mp.get("RE"));
             }
             else {
            	 out.println("RE x 0");
             }
         
         
         out.flush();
	   }
}
