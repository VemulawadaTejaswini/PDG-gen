import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static ArrayList[] connect;
  public static int[] nextStep;
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int M = scan.nextInt();
    int[] A = new int[M];
    int[] B = new int[M];
    connect = new ArrayList[N];
    nextStep = new int[N];
    for(int i=0; i<N; i++) {
      connect[i] = new ArrayList<Integer>();
      nextStep[i] = -1;
    }
    for(int i=0; i<M; i++) {
      A[i] = scan.nextInt();
      B[i] = scan.nextInt();
      connect[A[i]-1].add(B[i]-1);
      connect[B[i]-1].add(A[i]-1);
    }
    scan.close();

    nextStep[0] = 0;
    ArrayList<Integer> nextTargets = new ArrayList<Integer>();
    nextTargets.add(0);

    while(nextTargets.size() != 0) {
      ArrayList<Integer> tempTargets = new ArrayList<Integer>();
      for(int i=0; i<nextTargets.size(); i++) {
        for(int j=0; j<connect[nextTargets.get(i)].size(); j++) {
          int nextTarget = (int)connect[nextTargets.get(i)].get(j);
          if(nextStep[nextTarget] == -1) {
            nextStep[nextTarget] = nextTargets.get(i);
            tempTargets.add(nextTarget);
          }
        }
      }
      nextTargets = tempTargets;
    }

    System.out.println("Yes");
    for(int i=1; i<N; i++) {
      System.out.println(nextStep[i] + 1);
    }
  }
}