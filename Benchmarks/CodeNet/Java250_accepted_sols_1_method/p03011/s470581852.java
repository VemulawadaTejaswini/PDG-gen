import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int P = sc.nextInt();
            int Q = sc.nextInt();
            int R = sc.nextInt();
            int[] list = {P, Q, R};
            Arrays.sort(list);
            System.out.println(list[1] + list[0]);
          }
}