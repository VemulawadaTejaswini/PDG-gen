import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int m = 0;
    for (int i = 0; i < N; i++){
      int j = sc.nextInt();
      if (j >= K){
        m++;
      }
    }
    System.out.println(m);
  }
}