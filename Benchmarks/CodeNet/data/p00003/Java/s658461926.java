import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	 public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String input = br.readLine();
	        int n = Integer.valueOf(input);
	        while(n > 0 && (input = br.readLine()) != null) {
	            String[] s = input.split(" ");
	            int[] edges = {
	                (int) Math.pow(Integer.valueOf(s[0]), 2),
	                (int) Math.pow(Integer.valueOf(s[1]), 2),
	                (int) Math.pow(Integer.valueOf(s[2]), 2),
	            };            
	            Arrays.sort(edges);
	            System.out.println(((edges[0]+edges[1])==edges[2]) ? "YES" : "NO");
	            n--;
	        }
	    }
}