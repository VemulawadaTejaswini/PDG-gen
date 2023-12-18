import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static ArrayList[] connect;
  public static int[] minStep;
  public static int[] nextStep;
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int M = scan.nextInt();
    int[] A = new int[M];
    int[] B = new int[M];
    connect = new ArrayList[N];
    minStep = new int[N];
    nextStep = new int[N];
    for(int i=0; i<N; i++) {
      connect[i] = new ArrayList<Integer>();
      minStep[i] = Integer.MAX_VALUE;
    }
    for(int i=0; i<M; i++) {
      A[i] = scan.nextInt();
      B[i] = scan.nextInt();
      connect[A[i]-1].add(B[i]-1);
      connect[B[i]-1].add(A[i]-1);
    }
    scan.close();

    minStep[0] = 0;
    nextStep[0] = 0;
    rec(0, 0);
    System.out.println("Yes");
    for(int i=1; i<N; i++) {
      System.out.println(nextStep[i] + 1);
    }
  }

  public static void rec(int argTarget, int argCost) {
    for(int i=0; i<connect[argTarget].size(); i++) {
      int nextTarget = (int)connect[argTarget].get(i);
      if(minStep[nextTarget] > argCost + 1) {
        minStep[nextTarget] = argCost + 1;
        nextStep[nextTarget] = argTarget;
        rec(nextTarget, argCost + 1);
      }
    }
  }
}