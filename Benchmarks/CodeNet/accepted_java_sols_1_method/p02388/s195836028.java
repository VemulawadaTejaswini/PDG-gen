

import java.io.*;

public class Main{
               public static void main(String args[]) throws IOException{
               
                 int x = 0;
                 InputStreamReader isr = new InputStreamReader(System.in);
                 BufferedReader br = new BufferedReader(isr);
                 String buf = br.readLine();
                 x = Integer.parseInt(buf);
                      
               System.out.println((int)Math.pow(x,3));
           }
    }