import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int M = N / 2;
            if(N % 2 == 0){
              System.out.println((double) M / N);
            } else {
              System.out.println((double) (M + 1) / N);
            }
        }
}