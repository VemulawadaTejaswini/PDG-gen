import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int oneStart = 0;
    int zeroStart = 0;
    for (int i = 0; i < S.length(); i += 2) {
      if (S.charAt(i) == '0')
        oneStart++;
    }
    for (int i = 1; i < S.length(); i += 2) {
      if (S.charAt(i) == '1')
        oneStart++;
    }

    for (int i = 0; i < S.length(); i += 2) {
      if (S.charAt(i) == '1')
        zeroStart++;
    }
    for (int i = 1; i < S.length(); i += 2) {
      if (S.charAt(i) == '0')
        zeroStart++;
    }
    System.out.println(Math.min(oneStart, zeroStart));
  }
}
