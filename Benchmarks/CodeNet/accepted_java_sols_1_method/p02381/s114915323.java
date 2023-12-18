import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    boolean bool = true;

    while(bool){
      int n = sc.nextInt();

      if(n == 0){
        bool = false;
        break;
      }

      double s[] = new double[n];
      double sum = 0;
      double a = 0;

      for(int i = 0; i < n; i++){
        s[i] = sc.nextDouble();
        sum += s[i];
      }

      double m = sum / n;

      for(int i = 0; i < n; i++){
        a += Math.pow((s[i] - m), 2);
      }

      System.out.println(Math.sqrt(a / n));
    }
  }
}

