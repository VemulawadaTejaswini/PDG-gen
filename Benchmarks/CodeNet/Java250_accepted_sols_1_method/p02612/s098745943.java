import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter prnt = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(read.readLine());
        
        int n = parseInt(st.nextToken());
        
        int a = n % 1000;
        
        if(a==0) {
        	System.out.println(0);
        }
        else {
        	System.out.println(1000-a);
        }

	}

	
}
