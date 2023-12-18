import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] array = new long[n + 1];
    for(int i = 0; i <= n; i++){
      array[i] = sc.nextLong();
    }
    System.out.println(solve(array));
  }
  static long solve(long[] a){
    long[] nodeCount = new long[a.length];
    long prev = 0;
    for(int i = a.length - 1; i > 0; i--){
      nodeCount[i] = prev + a[i];
      prev = nodeCount[i];
    }
    nodeCount[0] = 1;

    for(int i = 1; i < a.length; i++){
      long tmp = nodeCount[i - 1] - a[i - 1];
      if(tmp <= 0){
        return -1;
      } else {
        nodeCount[i] = Math.min(nodeCount[i], tmp * 2);
      }
    }
    if(nodeCount[nodeCount.length - 1] != a[a.length - 1]){
      return -1;
    }
    return Arrays.stream(nodeCount).sum();
  }
}
