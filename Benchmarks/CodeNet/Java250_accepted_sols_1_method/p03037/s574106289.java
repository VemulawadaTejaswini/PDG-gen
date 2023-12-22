import java.util.*;
public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int M = sc.nextInt();
    
    int[] L = new int[M];
    int[] R = new int[M];

    for (int i = 0; i < M; i++) {
      L[i] = sc.nextInt();
      R[i] = sc.nextInt();
    }

    sc.close();

    int min = 0;
    int max = N;

    for (int i = 0; i < M; i++) {
      min = Math.max(L[i], min);
      max = Math.min(R[i], max);
    }

    if (max < min){
      System.out.println(0);
    } else {
      System.out.println(max - min + 1);
    }
 
  }

}