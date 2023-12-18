import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long x = sc.nextLong();
    long ans = b/x;
    if(a!=0){
      ans-=(a-1)/x;
    }else{
      ans++;
    }
    System.out.println(ans);
  }
}