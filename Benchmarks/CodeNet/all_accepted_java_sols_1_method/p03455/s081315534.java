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
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      if(a * b % 2 == 0){
        out.println("Even");
      }else{
      	out.println("Odd");
      }
      out.close();
    }
}