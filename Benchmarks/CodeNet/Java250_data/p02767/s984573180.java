import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] x = new int[n];
    double sum = 0;
    double ave;
    int ans = 0;

    for(int i = 0; i < n; i++){
      x[i] = sc.nextInt();
      sum += x[i];
    }

    ave = sum / n;

    if(ave - Math.floor(ave) < 0.5){
      for(int i = 0; i < n; i++){
        ans += (x[i] - Math.floor(ave)) * (x[i] - Math.floor(ave));
      }
    } else {
      for(int i = 0; i < n; i++){
        ans += (x[i] - Math.ceil(ave)) * (x[i] - Math.ceil(ave));
      }
    }

    System.out.println(ans);
  }
}
