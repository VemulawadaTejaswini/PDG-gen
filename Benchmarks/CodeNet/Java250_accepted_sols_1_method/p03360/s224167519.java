import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();    
    int C = sc.nextInt();    
    int K = sc.nextInt();
    int max = Math.max(Math.max(A,B),Math.max(B,C));
    int res = A + B + C - max;
    System.out.println(res + max * (int)Math.pow(2,K));
  }
}