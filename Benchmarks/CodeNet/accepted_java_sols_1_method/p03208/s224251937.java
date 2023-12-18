import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] h = new int[N];
    for (int i = 0; i < N; i++){
      h[i] = sc.nextInt();
    }

    sc.close();

    Arrays.sort(h);

    int min = h[N - 1];
    for (int i = 0; i < N - K + 1; i++){
      int a = 0;
      a = h[i + K - 1] - h[i];
      min = Math.min(a, min);
      if (min == 0){break;}
    }

    System.out.println(min);
    
  }
}
