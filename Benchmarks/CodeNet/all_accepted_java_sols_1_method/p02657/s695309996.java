import java.util.*;
import java.io.*;
 
class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    double m = sc.nextLong();
    long result = (long)Math.round(m*100);
    
    result = result*n/100;
    
    System.out.println(result);
  }
}