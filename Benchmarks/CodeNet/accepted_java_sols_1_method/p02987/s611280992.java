import java.util.*;

public class Main {
  public static void main(String[] args) {
    int i, count_a = 0, count_b = 0, count_c = 0, count_d = 0;
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    for(i = 0; i < 4; i++) {
      if(str.charAt(0) == str.charAt(i)) count_a++;
      if(str.charAt(1) == str.charAt(i)) count_b++;
      if(str.charAt(2) == str.charAt(i)) count_c++;
      if(str.charAt(3) == str.charAt(i)) count_d++;
    }
    if(count_a == 2 && count_b == 2 && count_c == 2 && count_d == 2) System.out.println("Yes");
    else System.out.println("No");
  }
}
