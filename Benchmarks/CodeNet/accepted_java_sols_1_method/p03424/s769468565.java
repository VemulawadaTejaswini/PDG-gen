import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            Set<String> set1 = new HashSet<>();
            for(int i = 0; i < N; i++){
              set1.add(sc.next());
            }
            int ans = set1.size();
            if(ans == 3){
              System.out.println("Three");
            } else {
              System.out.println("Four");
            }
          }
}