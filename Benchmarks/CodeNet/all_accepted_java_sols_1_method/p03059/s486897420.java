import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String str = br.readLine();
      	final int DURATION = Integer.parseInt(str.split(" ")[0]);
      	final int NUM = Integer.parseInt(str.split(" ")[1]);
      	final int TIMELIMIT = Integer.parseInt(str.split(" ")[2]);
      	
      	int total = 0;
      	for (int i = 0; i < TIMELIMIT / DURATION; i++) {
   			total += NUM;
      	}
      	System.out.println(total);
	}
}
