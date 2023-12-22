import java.util.*;
import java.math.*;
import java.lang.*;
import java.io.*;

public class Main{
  public static void main(String args[]) throws IOException{
    Scanner s=new Scanner(System.in);
   
    
    int n=s.nextInt();
    String ss=s.next();
    String st="";
    
    for(int i=0;i<ss.length();i++){
      int c=0;
      if((int)ss.charAt(i)+n>90)
        c=(int)ss.charAt(i)+n-90+64;
      else
        c=(int)ss.charAt(i)+n;
      
      st+=(char)c;
    }
    System.out.println(st);
  }
}