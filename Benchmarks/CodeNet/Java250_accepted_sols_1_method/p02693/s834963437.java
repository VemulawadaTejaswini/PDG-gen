import java.util.*;
import java.math.BigInteger;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int x = A / K;
    int X = (x+1)*K;
    
    if(A == x*K) {
      System.out.println("OK");
    } else if(A<X && X<=B) {
      System.out.println("OK");
    } else {
      System.out.println("NG");
    }
  }
}