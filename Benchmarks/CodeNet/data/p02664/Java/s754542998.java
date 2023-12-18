import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String T = sc.nextLine();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < T.length(); i++) {
      if (T.charAt(i) != '?')
        sb.append(T.charAt(i));
      else if (i < T.length() - 1 && T.charAt(i + 1) == 'D')
        sb.append('P');
      else
        sb.append('D');
    }
    System.out.println(sb.toString());
  }
  
}
