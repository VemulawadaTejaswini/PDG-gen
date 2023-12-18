import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long n = sc.nextLong();
    n = Math.min(b-1,n);
    long ans = a * n / b;
    System.out.println(ans);
  }
}
