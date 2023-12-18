import java.util.Scanner;
import java.util.Arrays;

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] X = new int[N];
    int[] Y = new int[N];
    for (int i =0; i<N; i++) {
      X[i] = sc.nextInt();
      Y[i] = X[i];
    }
    Arrays.sort(Y);
    int Ysmall = Y[N/2-1];
    int Ylarge = Y[N/2];
    for (int i =0; i<N; i++) {
      if (X[i] <= Ysmall) {
        System.out.println(Ylarge);
      } else {
        System.out.println(Ysmall);
      }
    }                           
  }
}  