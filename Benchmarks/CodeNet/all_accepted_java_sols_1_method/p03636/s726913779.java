import java.util.Arrays;
import java.util.Scanner;
 
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ans = 0;

    String s = sc.next();
    String a,b;
    int x = s.length();
    a = String.valueOf(s.charAt(0));
    b = String.valueOf(s.charAt(x-1));
    System.out.println(a + (x-2) + b);

    sc.close();
  }
}
