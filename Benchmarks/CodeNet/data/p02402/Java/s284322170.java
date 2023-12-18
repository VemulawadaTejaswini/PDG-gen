import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      	int x = Integer.parseInt(br.readLine()); 
      	String y[] = br.readLine().split(" ");
       	int a;
      	int max = Integer.MIN_VALUE;
      	int min = Integer.MAX_VALUE;
      	long sum = 0;
      	for (int i = 0; i < x; i++) {
        	a = Integer.parseInt(y[i]);
          	if(a > max) {
            	max = a;
            }
            if(a < min) {
            	min = a;
            }
          	sum += a;
        }
      	System.out.println(min + " " + max + " " +sum);

    }
}
