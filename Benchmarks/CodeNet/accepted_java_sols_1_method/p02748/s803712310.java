import java.util.*;
import static java.lang.Math.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int M = sc.nextInt();
    int[] a = new int[A];
    int[] b = new int[B];
    int[] sum = new int[M];
    for(int i = 0; i < A; i++){
      a[i] = sc.nextInt();
    }
    for(int i = 0; i < B; i++){
      b[i] = sc.nextInt();
    }
    for(int i = 0; i < M; i++){
      sum[i] = a[sc.nextInt() - 1] + b[sc.nextInt() - 1] - sc.nextInt();
    }
    Arrays.sort(sum);
    Arrays.sort(a);
    Arrays.sort(b);
    if(a[0] + b[0] < sum[0])sum[0] = a[0] + b[0];
    System.out.println(sum[0]);
  }
}