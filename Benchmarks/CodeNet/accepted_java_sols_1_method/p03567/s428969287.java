import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter writer = new PrintWriter(System.out);
		
		int i = br.readLine().indexOf("AC");
		
		if(i >= 0) writer.println("Yes");
		else writer.println("No");
		
		br.close();
		writer.close();
	}
}