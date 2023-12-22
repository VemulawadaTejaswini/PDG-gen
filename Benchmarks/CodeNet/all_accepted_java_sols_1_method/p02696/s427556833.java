import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      long A = Long.parseLong(sc.next());
      long B = Long.parseLong(sc.next());
      long N = Long.parseLong(sc.next());
      double ans = 0;
      if(N >= B){
        ans = Math.floor(A*(B-1)/B) - A * Math.floor((B-1)/B);
        System.out.println((long)ans);

      }else{
        ans = Math.floor(A*N/B) - A * Math.floor(N/B);
        System.out.println((long)ans);

      }
  }
}
