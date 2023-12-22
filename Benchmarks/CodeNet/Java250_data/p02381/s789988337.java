import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
 
public class Main {
	public void exec() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        while(true) {
        	int n = Integer.parseInt(br.readLine());
        	if(n==0) break;
        	int[] sary = new int[n];
        	double avg=0, var=0;
        	int i=0;
        	for(String s: br.readLine().split(" ")) {
        		avg += sary[i++] = Integer.parseInt(s);
        	}
        	avg /= n;
        	for(int s: sary) {
        		var += Math.pow(s - avg,2);
        	}
        	out.printf("%.4f\n",Math.sqrt(var/n));
        }
        out.flush();
    }
  
    public static void main(String[] args) throws IOException {
        new Main().exec();
    }
}