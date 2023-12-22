// package abc174;
import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int d = sc.nextInt();
   int count = 0;
   for(int i=0;i<n;i++){
    long x = sc.nextLong();
    long y = sc.nextLong();
    if(Math.sqrt(x*x + y*y)<=d){
      count++;
    }
   }
   System.out.println(count);
  }
}
