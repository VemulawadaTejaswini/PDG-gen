import java.util.*;

class Main {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          StringBuilder sb = new StringBuilder();

          int n = sc.nextInt();
          for (int i=1; i<=n; i++) {
              if (i%3 == 0 || i%10 ==3) {
                   sb.append(i);
                   sb.append(" ");
              }
          }
          System.out.println(sb);
      }
}