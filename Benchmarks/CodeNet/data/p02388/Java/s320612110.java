
import java.io.*;

public class Main{
               public static void main(String args[]){
               
                 int x = 0;
                      do{
                      System.out.println("Form your number:");
                      InputStreamReader isr = new InputStreamReader(System.in);
                      BufferedReader br = new BufferedReader(isr);
                      try{
                      String buf = br.readLine();
                      x = Integer.parseInt(buf);
                      }catch(Exception e){
                        x = 0;
                }
                    }while(x<0||100<x);
                 
               System.out.println("The number powed by 3 is???");
               System.out.println("???"+ Math.pow(x,3)+"???");
           }
    }