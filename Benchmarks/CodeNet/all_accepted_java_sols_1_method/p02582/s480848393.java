import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



   public class Main
    {
  public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       
       String str = sc.next();
       int rain = 0;
       char ch;
       
       if(str.equals("RRR")) 
        System.out.println(3);
        
        else if(str.equals("RSS") || str.equals("RSR") || str.equals("SRS") || str.equals("SSR"))
        System.out.println(1);
        
        else if(str.equals("RRS") || str.equals("SRR"))
        System.out.println(2);
       
       else
       System.out.println(0);
       
    }
    }