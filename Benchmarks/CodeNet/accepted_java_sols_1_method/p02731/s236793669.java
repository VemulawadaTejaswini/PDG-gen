import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
    	// Solution sol = new Solution();
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	double k = (double)N/3;
    	System.out.println(Math.pow(k,3));

    }
}