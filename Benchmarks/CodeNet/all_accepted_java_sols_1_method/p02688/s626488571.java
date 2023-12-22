import java.util.*;

class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt(); //next(文字列), nextDouble, nextLine(1行)とか
    int K = sc.nextInt();
    boolean[] ans = new boolean[N];
    for (int i = 0; i < K; i++){
      int d = sc.nextInt();
      for (int j = 0; j < d; j++){
        int temp = sc.nextInt();
        ans[temp-1] = true;
      }
    }
    int ans2 = 0;
    for (int i = 0; i < N; i++){
      if(ans[i]){
        ans2++;
      }
    }
    System.out.println(N-ans2);        
  }
}
