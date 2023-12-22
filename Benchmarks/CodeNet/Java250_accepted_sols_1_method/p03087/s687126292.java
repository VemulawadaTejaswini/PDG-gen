import java.util.*;
public class Main {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Q = sc.nextInt();
    String S = sc.next();
    int[] l = new int[Q];
    int[] r = new int[Q];
    for (int i = 0; i < Q; i++) {
      l[i] = sc.nextInt();
      r[i] = sc.nextInt();
    }
    
    int[] c = new int[N+1];
    c[1] = 0;
    for (int i = 1; i < S.length(); i++) {
      char c1 = S.charAt(i-1);
      char c2 = S.charAt(i);
      if (c1 == 'A' && c2 == 'C') {
        c[i+1] = c[i] + 1;
      } else {
        c[i+1] = c[i];
      }
    }

    for (int i = 0; i < Q; i++) {
      System.out.println(c[r[i]] - c[l[i]]);
    }
  }
}