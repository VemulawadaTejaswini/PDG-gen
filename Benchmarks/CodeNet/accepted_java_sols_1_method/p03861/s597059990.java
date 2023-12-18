import java.util.*;

public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    long a = sc.nextLong();
    long b = sc.nextLong();
    long x = sc.nextLong();
    long ans = (b + x)/ x - (a + x - 1) / x;
    
    System.out.println(ans);
  }
}