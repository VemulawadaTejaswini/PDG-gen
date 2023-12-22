import java.util.*;
import java.io.*;
import java.math.*;
 
 
public class Main
{
    public static void main(String[] args) 
    { 
          Scanner input=new Scanner(System.in);
          int i = input.nextInt();
        //   String s = input.next();
        // int count =0;
        // int i=1000;
        int c1=0,c2=0,c3=0,c4=0;
          while(i>0){
             String s = input.next();
             
             if(s.equals("AC"))
             c1++;
             else if(s.equals("WA"))
             c2++;
             else if(s.equals("TLE"))
             c3++;
             else
             c4++;
             i--;
          }
          
          
          System.out.println("AC x "+ c1);
          System.out.println("WA x "+ c2);
          System.out.println("TLE x "+ c3);
          System.out.println("RE x "+ c4);
          
          
      
            
          input.close(); 
     } 
     
}