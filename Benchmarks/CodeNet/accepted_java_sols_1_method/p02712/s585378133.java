import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
              long N = sc.nextLong();
              long ans = 0;
              for(int i = 1; i <= N; i++){
                if(i % 15 == 0|| i % 5 == 0 || i % 3 == 0){
                } else {
                  ans += i;
                }
              }
              System.out.println(ans);
            }
        }