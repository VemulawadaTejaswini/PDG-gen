import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    Integer[] num = new Integer[N];
    
    for(int i =0; i < N; i++){
      num[i] = 0;
    }
    for(int i = 0; i < N; i++) {
      num[sc.nextInt() - 1]++;
    }
    Arrays.sort(num);    
    int ans = 0;
    if( N-K > 0){
      for(int i = 0; i < N-K ; i++){
        ans += num[i];
      }
    }
    System.out.println(ans);
  }
}