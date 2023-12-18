import java.util.*;

/**
 * @author masayamatu
 * 
 */
public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] A= new int[n];
    double[] B = new double[n];
    double sum = 0;
    double ans = 0;
    for(int i = 0; i < n; i++) {
      A[i] = sc.nextInt();
      B[i]= (double)1/A[i];
      sum += B[i];
    }
    
    ans = 1/sum;
    System.out.println(ans);
  }
}