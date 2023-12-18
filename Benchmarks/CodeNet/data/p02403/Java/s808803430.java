import java.util.*;
import java.io.*;

public class Main{
 public static void main(String[] args) throws IOException
 {
   Scanner sc = new Scanner(System.in);

   int W, H;
   do{
       W = sc.nextInt();
       H = sc.nextInt();
       for(int i=0; i<W; i++){
           for(int j=0; j<H; j++){
               System.out.print("#");
           }
           System.out.println("");
       }
       System.out.println("");
   }while(W != 0 && H != 0);

 }
}