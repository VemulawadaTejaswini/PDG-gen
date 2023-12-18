import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
              int K = sc.nextInt();
              String N = sc.next();
              if(K >= N.length()){
                System.out.println(N);
              } else {
                System.out.println(N.substring(0, K) + "...");
              }              
      }
    }