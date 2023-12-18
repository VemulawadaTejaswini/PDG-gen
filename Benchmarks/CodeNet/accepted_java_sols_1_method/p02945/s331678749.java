import java.util.*;
import java.lang.*;
import java.io.*;
 public class Main{
   public static void main(String[]args){
     Scanner s = new Scanner(System.in);
     int a = s.nextInt();
     int b = s.nextInt();
     int c = a+b;
     int d = a-b;
     int e =a*b;
     System.out.println(Math.max(c,Math.max(d,e)));
   }
 }