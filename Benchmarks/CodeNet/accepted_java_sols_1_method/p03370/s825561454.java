import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());
    int[] val = new int[N];
    int ans = N;
    int min = 1000000;
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(sc.next());
      M -= n;
      min = n < min ? n : min;
    }
    
    ans += M == 0 ? 0 : M/min;
    System.out.println(ans);
  }
}