import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    int sum = 0;
    int squareSum = 0;
    for(int i = 0; i < N; i++){
      a[i] = sc.nextInt();
      sum += a[i];
      squareSum += a[i] * a[i];
    }
    long x = Math.round(sum / (double)N);
    
    System.out.println(N*x*x-2*x*sum+squareSum);
  }
}