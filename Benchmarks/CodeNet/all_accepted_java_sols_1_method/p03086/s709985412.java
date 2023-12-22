import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int max = 0;
    for (int i = 0; i < S.length(); i++) {
      char c = S.charAt(i);
      if (c == 'A' || c == 'C' || c == 'G' || c == 'T') {
        int j = i+1;
        int count = 1;
        if (j >= S.length()) {
          if (count > max) {
            max = count;
          }
          break;
        }
        while (S.charAt(j)=='A' || S.charAt(j)=='C' || S.charAt(j)=='G' || S.charAt(j)=='T') {
          j++;
          count++;
          if (j >= S.length()) break;
        }
        if (count > max) {
          max = count;
        }
      }
    }
    System.out.println(max);
  }
}