import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int k = sc.nextInt();
    if(a >= k){
      System.out.println(k);
    }else if(a < k && a + b >= k) {
      System.out.println(a);
    }else if(a + b < k && a + b+ c >= k) {
      System.out.println(2 * a + b - k);
    }
  }
}