import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] p = new int[N];
    int[] px = new int[N];
    int count =0, ans =0;
    for (int i =0; i<N; i++) {
      p[i] = sc.nextInt();
    }
    System.arraycopy(p,0,px,0,p.length);
    Arrays.sort(px); //昇順にした配列
    for (int i =0; i<N; i++) {
      for (int j =i; j<N; j++) {
        int tmp =0; tmp = p[i]; p[i] = p[j]; p[j] = tmp;
        for (int l =0; l<N; l++) {
          if(p[l] == px[l]) count++;
        }
        if(count == N) {
          ans++;
        }
        tmp = p[j]; p[j] = p[i]; p[i] = tmp;
        count =0;
      }
    }
    if (ans != 0) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}