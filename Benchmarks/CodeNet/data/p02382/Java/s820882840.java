import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] X = new int[n];
    int[] Y = new int[n];

    for(int i = 0;i<n;i++){
      X[i] = scanner.nextInt();
    }

    for(int i = 0;i<n;i++){
      Y[i] = scanner.nextInt();
    }

    long sum = 0;
    double ans;
    for(int i = 0;i<n;i++){
      sum += Math.abs(X[i]-Y[i]);
    }
    System.out.printf("%.8f\n",(double)sum);

    sum = 0;
    for(int i = 0;i<n;i++){
      sum += Math.pow(Math.abs(X[i]-Y[i]),2);
    }
    ans = Math.sqrt(sum);
    System.out.printf("%.8f\n",ans);

    sum = 0;
    for(int i = 0;i<n;i++){
      sum += Math.pow(Math.abs(X[i]-Y[i]),3);
    }
    ans = Math.cbrt(sum);
    System.out.printf("%.8f\n",ans);

    int max = 0;;
    for(int i = 0;i<n;i++){
      int d = Math.abs(X[i]-Y[i]);
      if((i==0)||(max < d))max = d;
    }
    System.out.printf("%.8f\n",(double)max);


  }
}
