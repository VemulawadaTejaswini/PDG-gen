import java.util.*;
import java.lang.*;
import java.io.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
     int b = sc.nextInt();
     int h = sc.nextInt();
     int m = sc.nextInt();
    int re = (h*h)+(m*m);
    double res = Math.sqrt(re);
    System.out.println(res);
    
  }
}