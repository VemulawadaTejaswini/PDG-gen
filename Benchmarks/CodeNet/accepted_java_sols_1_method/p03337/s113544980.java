import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	InputStream input = System.in;
      	OutputStream output = System.out;
      	Scanner sc = new Scanner(input);
      	PrintWriter out = new PrintWriter(output);
      	int A = Integer.parseInt(sc.next());
      	int B = Integer.parseInt(sc.next());
      	int max = Math.max(A + B, Math.max(A - B, A * B));
      	out.println(max);
      	out.close();
    }
}