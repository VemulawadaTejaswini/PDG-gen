import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int[] a = new int[N];
    long sum=0;
    for(int i=0; i<N; i++){
      a[i] = sc.nextInt();
      sum += a[i];
    }

    int Q = sc.nextInt();
    int[] b = new int[Q];
    int[] c = new int[Q];

    for(int i=0; i<Q; i++){
      b[i] = sc.nextInt();
      c[i] = sc.nextInt();

      int diff = c[i] - b[i];
      for(int j = 0; j < N; j++){
        if(a[j] == b[i]){
          a[j] = c[i];
          sum += diff;
        }
      }

      System.out.println(sum);
    }

    return;
  }
}