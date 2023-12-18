import java.util.*;
import java.io.*;

public class Main {

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
                } 
                catch (IOException  e) { 
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
            try { 
                str = br.readLine(); 
            } 
            catch (IOException e) { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 



	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		FastReader fr = new FastReader();
		// System.out.println("Start!");
		int N = fr.nextInt();
		int count = 0;
		
		String st = fr.next();

		char[] chars = st.toCharArray();

		for (int i = 0; i < N; i++) {
			if (chars[i] == 'W') {
				for (int j = chars.length-1; j > i; j--) {
					if (chars[j] == 'R') {
						char temp = chars[i];
						chars[i] = chars[j];
						chars[j] = temp;
						count++;
						break;
					}
				}
			}
		}

		// System.out.println(Arrays.toString(chars));

		System.out.println(count);	
	}
}