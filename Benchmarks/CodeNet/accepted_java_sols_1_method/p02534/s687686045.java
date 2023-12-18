import java.util.*;
import java.io.*;

public class Main{
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main (String[] args) throws IOException{
        int k = Integer.parseInt(br.readLine());
		String s = "ACL";
		String op = "";
		for(int i=0;i<k;i++){
			op += s;
		}
		bw.write(op + "\n");
        bw.flush();
    }
  
}