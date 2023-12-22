import java.util.*;

public class Main {

  public static void main (String[] args) {

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

    sc.close();

    String[] s = S.split("");

    int[] ac = new int[N+1];
    
    ac[0] = 0;
    ac[1] = 0;

    for (int i = 1; i < N; i++){
      if (s[i-1].equals("A") && s[i].equals("C")) {
        ac[i+1] = ac[i] + 1; 
      } else {
        ac[i+1] = ac[i];
      }
    }

    for (int i = 0; i < Q; i++){
      System.out.println(ac[r[i]] - ac[l[i]]);
    }

  }

}