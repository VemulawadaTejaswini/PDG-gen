import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int N = sc.nextInt();
    String S = sc.next();
    StringBuilder X = new StringBuilder(S);
    for (int i =0; i<N; i++) {
      if (X.charAt(i) == '0') {
        X.replace(i,i+1,"1");
      } else {
        X.replace(i,i+1,"0");
      }
      String convertX = X.toString();
      int a = Integer.parseInt(convertX,2);
      int count =0;
      while (a != 0) {
        count++;
        int count1 =0;
        String bit = Integer.toBinaryString(a);
        for (int j =0; j<bit.length(); j++) {
          if (bit.charAt(j) == '1') count1++;
        }
        if (a % count1 == 0) {
          break;
        } else {
          a %= count1;
        }
      }
      System.out.println(count);
      X = new StringBuilder(S);
    }
  }
}