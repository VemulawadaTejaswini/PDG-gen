import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long a = sc.nextLong();
    long b = sc.nextLong();
    long ans;

    long quo = n / (a + b);
    long rem = n % (a + b);
    if(rem > a){
      ans = (quo + 1) * a;
    } else {
      ans = quo * a + rem;
    }
    System.out.println(ans);
  }
}
