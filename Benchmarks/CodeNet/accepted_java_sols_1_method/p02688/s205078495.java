import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int K = sc.nextInt();
            Set<Integer> set1 = new HashSet<>();
            for(int i = 0; i < K; i++){
             int a = sc.nextInt();
              for(int j = 0; j < a;j++){
                set1.add(sc.nextInt());
              }
            }
            System.out.println(N-set1.size());
          }
}