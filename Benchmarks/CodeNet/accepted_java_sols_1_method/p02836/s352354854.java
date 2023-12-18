import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int count =0;
    for (int i=0; i<S.length()/2; i++) {
      if(S.charAt(i) == S.charAt(S.length()-1-i)) {
        count++;
      }
    }
    System.out.println(S.length()/2 - count);
  }
}
    