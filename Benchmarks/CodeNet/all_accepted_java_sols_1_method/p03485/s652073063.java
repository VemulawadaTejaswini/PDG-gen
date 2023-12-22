import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
      InputStream inputStream = System.in;
      OutputStream outputStream = System.out;
      Scanner sc = new Scanner(inputStream);
      PrintWriter out = new PrintWriter(outputStream);
      double a = Integer.parseInt(sc.next());
      double b = Integer.parseInt(sc.next());
      int ans = (int)Math.ceil((a + b) / 2);
      out.println(ans);
      out.close();
    }
}