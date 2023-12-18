import java.io.*;
import java.util.Scanner;

public class Main{
               public static void main(String args[]){
               
                 int x = 0;
                 int y = 0;
                 int z = 0;

                 Scanner in = new Scanner(System.in);
                 

                 String buf1 = in.next();
                 String buf2 = in.next();

                 x = Integer.parseInt(buf1);
                 y = Integer.parseInt(buf2); 
                 z = 2*x+2*y; 
          
   
                 System.out.println(x*y +" "+ z);
            
           }
    }