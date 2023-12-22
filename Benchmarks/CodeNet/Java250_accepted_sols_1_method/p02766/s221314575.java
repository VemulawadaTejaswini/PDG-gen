import java.util.*;
import java.math.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(b == 10) {
      System.out.println(Integer.toString(a).length());
    } else {
      int num = 0;
      for(int i = a; i > 0; i /= b) {
        num++;
      }
      System.out.println(num);
    }
  }
}