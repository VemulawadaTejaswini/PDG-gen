import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    float[] A;
    A = new float[N+1];
    float tmp=0;
    for (int i= 1; i <= N; i++){
      A[i] = scan.nextFloat();
      tmp= tmp + 1/A[i];
    }
      System.out.println(1/tmp);
  
  }
}