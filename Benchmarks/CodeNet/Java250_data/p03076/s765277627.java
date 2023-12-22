
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
  public static void main(String[] args) {
	  FastReader sc = new FastReader();
	  int n = 5;
	  int[] dishes = new int[n];
	  int[] res = {Integer.MAX_VALUE, 0 };
	  
	  for (int i = 0; i < n; i++) {
		  dishes[i] = sc.nextInt();
	  }
	  
	  permutation(dishes, 0, n, res);
	  
	  System.out.println(res[0]);
  }
  
  private static void permutation(int[] nums, int begin, int end, int[] res) {
	  if (begin == end) {
		  int total = 0;
		  for (int i = 0; i < nums.length - 1; i++) {
			  total += (int)(Math.ceil(nums[i]/10.0) * 10.0);
		  }
		  res[0] = Math.min(res[0], total + nums[nums.length - 1]);
	  } else {
		  for (int i = begin; i < end; i++) {
			  swap(nums, i, begin);
			  permutation(nums, begin + 1, end, res);
			  swap(nums, i, begin);
		  }
	  }
  }
  
  private static void swap(int[] nums, int i, int j) {
	  int tmp = nums[i];
	  nums[i] = nums[j];
	  nums[j] = tmp;
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
