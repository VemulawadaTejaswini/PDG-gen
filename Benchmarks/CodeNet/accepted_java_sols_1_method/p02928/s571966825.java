import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int K = sc.nextInt();

    int[] A = new int[N];

    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }

    sc.close();

    long mod = 1000000007;

    // Aの内部で発生する転倒数
    long count1 = 0;

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (i < j && A[i] > A[j] ){
          count1++;
        }
      }
    }

    // AiとAjの間で発生する転倒数
    long count2 = 0;

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (A[i] > A[j]){
          count2++;
        }
      }
    }

    // A単体で発生する転倒数の総和（% mod）
    long mod1 = ((long)count1 * K) % mod;

    // AiとAjの間で発生する転倒数の総和（% mod）
    long mod2 = (count2 % mod) * ((((long)K * (long)(K-1))/2) % mod);

    System.out.println((mod1 + mod2) % mod);

  }

}