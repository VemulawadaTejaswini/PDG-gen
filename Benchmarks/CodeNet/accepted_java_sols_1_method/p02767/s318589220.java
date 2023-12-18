import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int[] X = new int[N];
    int min = Integer.MAX_VALUE;
    int max = 0;
    for(int i=0; i<X.length; i++) {
      X[i] = scan.nextInt();
      if(min > X[i]) {
        min = X[i];
      }
      if(max < X[i]) {
        max = X[i];
      }
    }
    scan.close();

    int minsum = Integer.MAX_VALUE;
    for(int i=min; i<=max; i++) {
      int sum = 0;
      for(int j=0; j<X.length; j++) {
        sum += (X[j] - i) * (X[j] -i);
      }
      if(minsum > sum) {
        minsum = sum;
      }
    }

    System.out.println(minsum);
  }
}