import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int N = Integer.parseInt(str);
    char[] c = str.toCharArray();
    int len = c.length;
    int[] digit = new int[len];
    int sum = 0;

    for(int i = 0; i < len; i++) {
      digit[i] = Character.getNumericValue(c[i]);
      sum += digit[i];
    }
    if(N % sum == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}