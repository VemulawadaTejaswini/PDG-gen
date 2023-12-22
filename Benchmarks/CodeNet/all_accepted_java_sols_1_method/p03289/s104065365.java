import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int count=0,check=0;
    if (S.charAt(0) == 'A') {
      for (int i=2; i<S.length()-1; i++) {
        if(S.charAt(i) == 'C') count++;
      }
      for (int i=0; i<S.length(); i++) {
        if(S.charAt(i) >= 'a' && S.charAt(i) <= 'z') check++;
      }
    }
    if (count == 1 && check == S.length()-2) {
      System.out.println("AC");
    } else {
      System.out.println("WA");
    }
  }
}