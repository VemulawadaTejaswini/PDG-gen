import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int X = sc.nextInt();
    int[] arr = new int[N+1];
    for(int i = 0; i<M; i++){
        int idx = sc.nextInt();
        arr[idx] = 1;
    }
    for(int i = X+1; i<N; i++){
      arr[i+1] += arr[i];
    }
    for(int i = X-1; i>0; i--){
      arr[i-1] += arr[i];
    }
    int res = Math.min(arr[0],arr[N]);
    System.out.println(res);
  }
}