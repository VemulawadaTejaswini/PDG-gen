import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws Exception{
    try (Scanner sc = new Scanner(System.in)){
      String S = sc.next();
      if (S.charAt(0) != 'A'){
        System.out.println("WA");
        return;
      }
      String sub = S.substring(2, S.length()-1);
      int count = 0;
      for (int i = 0; i < sub.length(); i++) {
        if (sub.charAt(i) == 'C') count++;
      }
      if (count != 1) {
        System.out.println("WA");
        return;
      }
      S = S.replace("A", "");
      S = S.replace("C", "");
      for (int i = 0; i < S.length(); i++) {
        if (Character.isUpperCase(S.charAt(i))) {
          System.out.println("WA");
          return;
        }
      }
      System.out.println("AC");
    }
  }
}
