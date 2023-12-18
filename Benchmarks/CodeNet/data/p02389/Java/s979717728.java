import java.io.*;

public class Main{
               public static void main(String args[]) throws IOException{
               
                 int x = 0;
                 int y = 0;

                 InputStreamReader isr1 = new InputStreamReader(System.in);
                 InputStreamReader isr2 = new InputStreamReader(System.in);
  
                 BufferedReader br1 = new BufferedReader(isr1);
                 BufferedReader br2 = new BufferedReader(isr2);

                 String buf1 = br1.readLine();
                 String buf2 = br2.readLine();

                 x = Integer.parseInt(buf1);
                 y = Integer.parseInt(buf2);  
   
                 System.out.println(x*y);
                 System.out.println(2*x + 2*y);
           }
    }