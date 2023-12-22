import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String line = br.readLine();
	    StringTokenizer st = new StringTokenizer(line);
	    int a = Integer.parseInt(st.nextToken());
	    int b = Integer.parseInt(st.nextToken());
	    if((a*b)%2==1){
	    	System.out.println("Odd");
	    }
	    else{
	    	System.out.println("Even");
	    }
	}

}
