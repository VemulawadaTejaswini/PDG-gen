import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws Exception{
    try (Scanner sc = new Scanner(System.in)){
      String S = sc.next();
      Double K = sc.nextDouble();
      if (K < 1.5) {
        System.out.println(S.charAt(0));
      } else {
        int i = 0;
        while(i < S.length()-1 && S.charAt(i) == '1') {
          i++;
        }
        if (K < 101.0 && i == K.intValue()) {
          System.out.println('1');
        } else {
          System.out.println(S.charAt(i));
        }
      }
    }
  }
}
