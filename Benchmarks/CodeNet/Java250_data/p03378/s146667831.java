import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int X = sc.nextInt();
    int array[] = new int[M];

    for(int i=0;i<M;i++){
      array[i] = sc.nextInt();
    }
    int[] cell = new int[N+1];

    Arrays.fill(cell,0);

    for(int i : array){
        cell[i] = 1;
    }

    int cost0 = 0;
    for(int i=X;i>=0;i--){
      cost0 += cell[i];
    }

    int costN = 0;
    for(int i=X;i<N+1;i++){
      costN += cell[i];
    }

    int cost = cost0 <= costN ? cost0 : costN;
    System.out.println(cost);
    }
}
