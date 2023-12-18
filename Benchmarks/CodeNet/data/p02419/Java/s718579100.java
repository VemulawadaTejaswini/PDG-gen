import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public void exec() throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	PrintWriter out = new PrintWriter(System.out);
    	String W = br.readLine();
    	int count=0;
    	while(true) {
        	String line = br.readLine();
        	if ("END_OF_TEXT".equals(line))
        		break;
        	String[] words = line.split(" ");
        	for(String word: words)
        		if(W.toLowerCase().equals(word.toLowerCase())) 
        			count++;
    	}
    	out.println(count);
        out.flush();
    }
 
    public static void main(String[] args) throws IOException {
    	new Main().exec();
    }
}