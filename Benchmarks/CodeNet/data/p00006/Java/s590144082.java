import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
	BufferReader br = new BufferReader(new InputStreamReader(System.in));
	string line;
	while((line=br.readLine()) != null){
	    StringBuffer sb = new StringBuffer().append(line);
	System.out.print(sb.reverse()+"\n");
	}
    }
}