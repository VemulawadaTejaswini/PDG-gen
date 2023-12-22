import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      	final int NUM;
      	final int DURATION;
      	final int TIMELIMIT;
      	String str = br.readLine();
      	DURATION = Integer.parseInt(str.split(" ")[0]);
      	NUM = Integer.parseInt(str.split(" ")[1]);
      	TIMELIMIT = Integer.parseInt(str.split(" ")[2]);
      	
      	int total = 0;
      	int nextCount = 1;
      	for (int i = 1; i <= TIMELIMIT; i++) {
      		if (i == nextCount * DURATION) {
      			total += NUM;
      			nextCount++;
      		}
      	}
      	System.out.println(total);
    }	
}
