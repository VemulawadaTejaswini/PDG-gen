import java.util.*;
import java.lang.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while(true){
      int n = sc.nextInt();

      if (n==0) break;

      int score[] = new int[n];
      double m = 0;

      for(int i=0; i<n; i++){
        score[i] = sc.nextInt();
        m += score[i];
      }

      m = m/n;

      double a = 0;

      for (int i=0; i<n; i++) a += Math.pow((double)(score[i]-m), 2)/n;

      a = Math.sqrt(a);

      System.out.println(a);
    }

  }
}

