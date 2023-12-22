import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    long d = sc.nextLong();

    long[] x = new long[n];
    long[] y = new long[n];

    long dDist = d*d;

    int counter = 0;

    for(int i=0; i<n; i++){
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();

      long dist = x[i] * x[i] + y[i] * y[i];
      if(dDist >= dist) counter++;
    }

    System.out.println(counter);
    
    return;

  }
}