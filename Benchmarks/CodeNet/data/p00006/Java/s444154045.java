import java.io.*;
import java.io.BufferedReader;
public class Main{
    public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String line;
	while((line=br.readLine()) != null){
	    StringBuffer sb = new StringBuffer().append(line);
	System.out.print(sb.reverse()+"\n");
	}
    }
}