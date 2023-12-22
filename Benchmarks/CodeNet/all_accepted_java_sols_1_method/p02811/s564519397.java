import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 
import java.util.*;
  
public class Main {  
	static Map<List<Integer>, Integer> dp;
	static int n;
	static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException { 
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		if (500 * k >= n) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}