import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] trees = new int[N];
    for(int i = 0; i < N; i++){
      trees[i] = sc.nextInt();
    }
    Arrays.sort(trees);
    int min = 1000000000;
    for(int i = 0; i < N - K + 1; i++){
      int d = trees[i+K-1] - trees[i];
      min = d > min ? min : d;
    }
    System.out.println(min);
  }
}