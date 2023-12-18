import java.util.*;
import java.util.function.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();

    StringBuilder buf;
    buf = new StringBuilder();
    for (int i = 0; i < b; i++) buf.append(String.valueOf(a));
    String ab = buf.toString();

    buf = new StringBuilder();
    for (int i = 0; i < a; i++) buf.append(String.valueOf(b));
    String ba = buf.toString();
    
    String ans = ab.compareTo(ba) < 0 ? ab : ba;
    System.out.println(ans);
  }
}