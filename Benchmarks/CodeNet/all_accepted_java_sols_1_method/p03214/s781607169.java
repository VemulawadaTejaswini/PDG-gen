import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int[] f = new int[N];
    int sum = 0;
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(sc.next());
      f[i] = n;
      sum += n;
    }
    
    double ave = (double)sum/N;
    int ans = 0;
    double min = 1000.0;
    for(int i = 0; i < N; i++){
      double n = Math.abs(ave - f[i]);
      if(n < min){
        ans = i;
        min = n;
      }
    }
    System.out.println(ans);
  }
}