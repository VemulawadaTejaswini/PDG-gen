import java.util.*;

public class Main{
  public static void main(String[] args)throws Exception{
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long d = B%2 == 0 ? (B/2) : ((B/2)+1);
    long ans = A%2 == 0 ? (A/2)*B : (A/2)*B+d;
    if(A == 1 || B == 1){
      ans = 1;
    }
    System.out.println(ans);
  }
}