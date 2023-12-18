import java.util.*;

class Main {
     public static void main(String[] args) {
          Scanner sc = new Scanner();
          StringBuilder sb = new StringBuilder();

          while (true) {
              int n = sc.nextInt();
              if (n%3 != 0) break;
              for (int i=3; i<=n; i+3) {
                  sb.append(i);
              }
              sb.append(" ");
          }
          System.out.println(sb);
      }
}