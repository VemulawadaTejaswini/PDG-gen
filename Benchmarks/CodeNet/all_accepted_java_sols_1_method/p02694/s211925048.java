import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String x = sc.next();
    long xx = Long.parseLong(x);
    long balance = 100;
    long ans = 0;
    while(balance < xx){
      balance = balance + (long)(balance * 0.01);
      ans++;
    }
    System.out.println(ans);
  }
}