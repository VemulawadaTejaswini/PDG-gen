import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
      try (Scanner sc = new Scanner(System.in)){
          while(sc.hasNextInt()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ans = a + b;
            int ansLen = String.valueOf(ans).length();
            System.out.println(ansLen);
          }
      }
    }
}