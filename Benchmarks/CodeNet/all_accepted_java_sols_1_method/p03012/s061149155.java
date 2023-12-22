import java.util.Scanner;
 
class Main {
    public static void main(final String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] w = new int[n];
      for (int i = 0; i < n; i++) {
        w[i] = sc.nextInt();
      }
      
      int f = 0;
      int b = 0;
      int f_cnt = 0;
      int b_cnt = n - 1;
      for (int j =0; j < n; j++) {
        if (f < b) {
          f += w[f_cnt++];
        } else {
          b += w[b_cnt--];
        }
      }
      System.out.println(Math.abs(f-b));
    }
  }