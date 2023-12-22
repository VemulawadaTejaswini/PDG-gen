import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    double[] arr = new double[N];
    double A = 0;
    double B = 1;
    for (int i=0;i<N;i++){
      double n = scan.nextDouble();
      arr[i] = n;
      A+=n;
      B*=n;
    }
    double a = 0;
    for (int i=0;i<N;i++){
      a += B/arr[i];
    }
    System.out.println(B/a);
  }
}