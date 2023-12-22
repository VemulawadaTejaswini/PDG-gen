import java.io.*;
import java.util.Scanner;

public class Main{
               public static void main(String args[]) throws IOException{
                     int a = 0;
                     int b = 0;
                     int c = 0;
                   
                     Scanner in = new Scanner(System.in);
                     
                     String buf1 = in.next();
                     String buf2 = in.next();
                     String buf3 = in.next();
                     
                     a = Integer.parseInt(buf1);
                     b = Integer.parseInt(buf2);
                     c = Integer.parseInt(buf3);

                        if(a < b && b < c){
                          System.out.println("Yes");
                       }else{
                          System.out.println("No");
                       }

              }
      }