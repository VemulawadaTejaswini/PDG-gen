import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i, count = 0;
    String str_a = sc.next();
    String str_b = sc.next();
    for(i = 0; i < str_a.length(); i++) {
      if(str_a.charAt(i) == str_b.charAt(i)) count++;
    }
    System.out.println(count);
  }
}
