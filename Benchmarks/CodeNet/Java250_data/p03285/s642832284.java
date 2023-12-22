
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	private static final int BASE = -2;
	private static final int CAKECOST = 4;
	private static final int DONUTCOST = 7;
	
	public static void main(String[] args) {
	  FastReader sc = new FastReader();
	  int n = sc.nextInt();
	  int cakeLimit = (int)(Math.ceil(n*1.0/CAKECOST));
	  int donutLimit = (int)(Math.ceil(n*1.0/DONUTCOST));
	  for (int i = 0; i <= cakeLimit; i++) {
		  for (int j = 0; j <= donutLimit; j++) {
			  int total = (i * CAKECOST) + (j * DONUTCOST);
			  if (total == n) {
				  System.out.println("Yes");
				  System.exit(0);
			  }
		  }
	  }
	  System.out.println("No");
  }
  
  static class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
      br = new BufferedReader(new InputStreamReader(System.in));
    }
  
    String next() { 
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException  e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }

    long nextLong() {
      return Long.parseLong(next());
    }

    double nextDouble() { 
      return Double.parseDouble(next());
    }

    String nextLine() {
      String str = "";
        try{
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
      }
  }
}
