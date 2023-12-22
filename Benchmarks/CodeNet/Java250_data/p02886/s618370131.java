import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      
        int t = sc.nextInt();
      
        long result = 0;
          
        for (int i = 1; i < n; i++) {
          int a = sc.nextInt();
          result += a * t;
          t += a;
        }

        System.out.println(result);
    }
}
