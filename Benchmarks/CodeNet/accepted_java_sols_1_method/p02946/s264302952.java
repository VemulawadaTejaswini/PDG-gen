import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int K = sc.nextInt();
            int X = sc.nextInt();
            int L = X - K + 1;
            for(;L < X + K;L++){
              System.out.print(L + " ");
            }
          }
}