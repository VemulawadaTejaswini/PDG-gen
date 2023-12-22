import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	    String line;
	    StringBuilder sb = new StringBuilder();
	    line = br.readLine();
	    String[] strs = line.split(" ");
	    int a = Integer.parseInt(strs[0]);
	    int b = Integer.parseInt(strs[1]);
	    if (((a % 2) * (b % 2))%2 == 0)
	    	System.out.println("Even");
	    else
	    	System.out.println("Odd");
	    
	}
}
