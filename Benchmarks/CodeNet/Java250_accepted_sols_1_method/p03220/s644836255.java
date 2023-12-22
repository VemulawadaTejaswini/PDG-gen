import java.util.*;
import java.lang.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int T = sc.nextInt();
    int A = sc.nextInt();
    int[] H = new int[N];
    double[] temp = new double[N];

    for (int i = 0; i<N; i++){
      H[i] = sc.nextInt();
      temp[i] = 0;
    }

    double tp = 0;
    for (int i=0;i<N;i++){
      tp = T - H[i] * 0.006;
      temp[i] = Math.abs( tp - A);
    }

    int min_index = 0;
    double tmp = temp[0];
    for (int i = 0; i<N; i++){
      if (tmp > temp[i]) {
        tmp = temp[i];
        min_index = i;
      }
    }

    System.out.println(min_index+1);

  }
}
