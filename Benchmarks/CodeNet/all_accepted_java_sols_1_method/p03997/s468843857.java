import java.io.*;
import java.util.Scanner;

public class Main {

   public static void main(String args[]) {

    Scanner scan = new Scanner(System.in);

     String l = scan.next();
	 String m =scan.next();     
	 String n = scan.next(); 
	     
    int a = Integer.parseInt(l);
    int b = Integer.parseInt(m);
    int h = Integer.parseInt(n);

    
          	   	 System.out.println(((a+b)*h)/2);
   
   }
   }
   