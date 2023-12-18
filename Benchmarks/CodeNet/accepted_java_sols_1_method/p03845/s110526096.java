import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner S = new Scanner(System.in);
    int N = S.nextInt();
    int T[] = new int[N];
    int sum = 0;
    for (int i = 0; i < N; i++){
      T[i] = S.nextInt();
      sum += T[i];
    }
    int M = S.nextInt();
    for (int i = 0; i < M; i++){
      int P = S.nextInt() -1 ;
      int X = S.nextInt();
      System.out.println(sum - T[P] + X);
    }
  }
}