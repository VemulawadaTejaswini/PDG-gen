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
      int A = Integer.parseInt(sc.next());
      int B = Integer.parseInt(sc.next());
      int C = Integer.parseInt(sc.next());
      int D = Integer.parseInt(sc.next());
      
      if(A + B < C + D){
      	out.println("Right");
      }else if(A + B > C + D){
      	out.println("Left");
      }else{
      	out.println("Balanced");
      }  
      out.close();
    }
}