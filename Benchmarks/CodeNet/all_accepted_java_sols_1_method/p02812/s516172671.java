import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    String str = sc.next();
    int out = 0;
 
    for (int i = 0; i < count -2; i++) {
      if ('A' == str.charAt(i) && 'B' == str.charAt(i + 1) && 'C' == str.charAt(i + 2)) {
            out++;
      }
    }
    System.out.println((long) out);
  }
}