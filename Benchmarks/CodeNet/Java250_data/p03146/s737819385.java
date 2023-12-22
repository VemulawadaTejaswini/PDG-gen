import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	// AtCoder Beginner Contest 116
	// https://atcoder.jp/contests/abc116/tasks
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int s = sc.nextInt();
		int idx = 1;
		Set<Integer> set = new HashSet<>();
		set.add(s);
		
		while (true) {
			idx++;
			if (s % 2 == 0) {
				s /= 2;
			} else {
				s = (3 * s) + 1;
			}
			
			if (set.contains(s)) {
				System.out.println(idx);
				System.exit(0);
			} else {
				set.add(s);
			}
		}
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
