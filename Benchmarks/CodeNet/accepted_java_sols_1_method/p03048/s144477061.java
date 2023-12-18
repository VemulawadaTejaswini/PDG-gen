import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int R, G, B, N;
    int S = 0;
    R = sc.nextInt();
    G = sc.nextInt();
    B = sc.nextInt();
    N = sc.nextInt();
    for (int i=0;i<=N/R;i++){
      for (int j=0;j<=N/G;j++){
        if ((N - R * i - G * j) % B == 0 && N - R * i - G * j >= 0){
          S += 1;
        }
      }
    }
    System.out.println(S);
  }
}