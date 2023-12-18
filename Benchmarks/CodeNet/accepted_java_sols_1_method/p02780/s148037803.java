import java.util.*;
import java.math.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Integer array[] = new Integer[N];
        for (int i=0;i<N;i++){
          array[i] = sc.nextInt();
        }
        double p[] = new double[1005];
        for (int i=0;i<1005;i++){
          p[i] = i*(i+1)/2;
          p[i] /= i;
        }
      
      double ans = 0;
      for (int i=0;i<K;i++){
        ans += p[array[i]];
      }
      double tempans = ans;
      for (int i=K;i<N;i++){
         tempans += p[array[i]];
         tempans -= p[array[i-K]];
         ans = Math.max(ans,tempans);
      }
      System.out.println(ans);

    }
}