import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
public class Main {
  public static void main(String[] args){
        
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int cnt = 0;
    for (int i = 1; i < K+1; i++) {
      for (int j = 1; j < K+1; j++) {
        for (int j2 = 1; j2 < K+1; j2++) {
          //gcd
          cnt += gcd(i, j, j2);
        }
      }
    }
    System.out.println(cnt);
    
   
    sc.close();
  }
  static int gcd (int a, int b, int c){
    int result = gcd(a, b);
    return gcd(c, result);
  }
  static int gcd (int a, int b) {
    return b>0?gcd(b,a%b):a;
  }

}