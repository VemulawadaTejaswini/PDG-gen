import java.util.*;
 
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long d = sc.nextLong();
    
    long ans = max(max(a * c,a * d),max(b * c,b * d));
    
    System.out.print(ans);
  }
}