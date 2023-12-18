import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int N = s.nextInt();
    int T[] = new int[N];
    int Sum = 0;
    for (int i = 0;i < N; i++){
      T[i] = s.nextInt();
      Sum += T[i];
    }
    int M = s.nextInt();
    int Sum2;
    for (int i = 0; i < M; i++){
      Sum2 = Sum;
      Sum2 -= T[s.nextInt() - 1];
      Sum2 += s.nextInt();
      System.out.println(Sum2);
    }
  }
}