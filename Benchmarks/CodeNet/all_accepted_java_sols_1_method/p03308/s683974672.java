import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] st = new int[n];
            for(int i = 0; i < n; i++){
              st[i] = sc.nextInt();
          }
          Arrays.sort(st);
          int a = st[0];
          int b = st[n-1];
          System.out.println(Math.abs(a-b));
}
}