import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringJoiner;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int K = scan.nextInt();
    String S = scan.next();
    int N = S.length();
    String[] split = S.split("");
    if (N <= K) {
      System.out.println(S);
    }
    else{
      String str[] = new String[K];
      for (int i = 0;i < K ;i++) {
        str[i] = split[i];
      }
      StringJoiner T = new StringJoiner("");
    for (String s : str) {
      T.add(s);
    }
      System.out.println(T + "...");
    }
  }
}

