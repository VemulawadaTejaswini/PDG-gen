import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N,K;
    N = sc.nextInt();
    K = sc.nextInt();
    int h[] = new int[N];
    for(int i=0; i<N; i++) h[i] = sc.nextInt();
    Arrays.sort(h);
    int ans = 1000000007;
    int tmp;
    for(int i=0; i<N-K+1; i++){
      tmp = h[i+K-1] - h[i];
      ans = Math.min(ans, tmp);
    }
    System.out.println(ans);
                               
  }
}