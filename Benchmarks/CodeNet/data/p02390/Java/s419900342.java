import java.io.*;

public class Main{
               public static void main(String args[]) throws IOException{
               
               int x = 0;
               int h = 0;
               int m = 0;
               int s = 0;

               InputStreamReader isr = new InputStreamReader(System.in);
               BufferedReader br = new BufferedReader(isr);
               String buf = br.readLine();
                 
               x = Integer.parseInt(buf);
               
               h = x / 3600;
               m = (x - h * 3600) / 60;
               s = x - h * 3600 - m * 60;  

               System.out.println(h +":"+ m +":"+ s);

            }
     }