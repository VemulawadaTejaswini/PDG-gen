import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    double[] x = new double[n];
    double[] y = new double[n];
    double d1 = 0;
    double d2 = 0;
    double d3 = 0;
    double di = 0;

    for(int i = 0; i < n; i++){
      x[i] = sc.nextDouble();
    }

    for(int i = 0; i < n; i++){
      y[i] = sc.nextDouble();
    }

    for(int i = 0; i < n; i++){
      d1 += Math.abs(x[i] - y[i]);
    }

    for(int i = 0; i < n; i++){
      d2 += Math.pow(x[i] - y[i], 2);
    }

    for(int i = 0; i < n; i++){
      d3 += Math.pow(Math.abs(x[i] - y[i]), 3);
    }

    for(int i = 0; i < n; i++){
      if(Math.abs(x[i] - y[i]) > di){
        di = Math.abs(x[i] - y[i]);
      }
    }

    System.out.println(d1);
    System.out.println(Math.sqrt(d2));
    System.out.println(Math.cbrt(d3));
    System.out.println(di);
  }
}

