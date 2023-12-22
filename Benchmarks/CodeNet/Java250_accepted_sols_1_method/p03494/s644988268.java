import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++){
      a[i] += sc.nextInt();
    }
    int ans = 0;
    ending:while (true){
      for (int i = 0; i < N; i++){
        if (a[i]%2 == 1) break ending;
        a[i] /= 2;
      }
      ans++;
    }
    System.out.println(ans);
  }
}
