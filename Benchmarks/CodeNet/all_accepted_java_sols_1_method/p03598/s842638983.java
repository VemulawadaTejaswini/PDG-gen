import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int x[] = new int[N];
    int ans = 0;
    for(int i=0;i<N;i++){
      x[i] = sc.nextInt();
    }
    for(int i=0;i<N;i++){
      int hoge = K-x[i];
      if(2*x[i] < 2*hoge){
        ans += 2*x[i];
      }else{
        ans += 2*hoge;
      }
    }
    System.out.println(ans);
  }
}
