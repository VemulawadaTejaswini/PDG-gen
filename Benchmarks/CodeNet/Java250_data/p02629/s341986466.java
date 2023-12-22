import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    String res = func(n);
    System.out.println(res);
  }
  
  public static String func(long n) {
    n--;
    if(n <= 25 && 0 <= n)
      return Character.toString((char)(97 + n));
    String res = func(n/26) + ((char)(97 + (n%26)));
    
    return res;
  }
}
