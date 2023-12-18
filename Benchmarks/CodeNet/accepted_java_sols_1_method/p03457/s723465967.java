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
      int N = Integer.parseInt(sc.next());
      int preT = 0;
      int preX = 0;
      int preY = 0;
      
      boolean judge = true;
      for(int i = 0; i < N; i++){
      	int postT = Integer.parseInt(sc.next());
        int postX = Integer.parseInt(sc.next());
        int postY = Integer.parseInt(sc.next());
        
        int dt = postT - preT;
        int dist = Math.abs(postX - preX) + Math.abs(postY - preY);
        if(dt < dist || (dt - dist) % 2 != 0){
        	judge = false;
          	break;
        }
        preX = postX;
        preY = postY;
        preT = postT;
      }
      
      if(judge){
      	 out.println("Yes");
      }else {
     	 out.println("No");
      }
      out.close();
    }
}