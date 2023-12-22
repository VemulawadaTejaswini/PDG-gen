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
      String a = sc.next();
      String b = sc.next();
      int ab = Integer.parseInt(a + b);
      double number = Math.sqrt(ab);
      if(number == Math.floor(number)){
      	out.println("Yes");
      }else{
      	out.println("No");
      }
      out.close();
    }
}