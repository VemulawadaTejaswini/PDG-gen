import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    int[] count = new int[N];
    int max =0;
    for (int i=0; i<N; i++) {
      HashSet<Character> X = new HashSet<Character>();
      HashSet<Character> Y = new HashSet<Character>();
      for (int j=0; j<i; j++) {
        X.add(S.charAt(j));
      }
      for (int j=i; j<N; j++) {
        Y.add(S.charAt(j));
      }
      for (char a : Y) {
        if (X.contains(a)) count[i]++;
      }
      max = Math.max(count[i],max);
    }
    System.out.println(max);
  }
}