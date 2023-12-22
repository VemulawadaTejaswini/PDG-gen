import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);

      long a = sc.nextInt();
      long b = sc.nextInt();
      long c = sc.nextInt();
      long x = sc.nextInt();
      long y = sc.nextInt();

      long ans_1 = 0L;
      long ans_2 = 0L;
      long tmp_1 = 0L;
      long tmp_2 = 0L;

      ans_1 = a*x + b*y;

      if(a < b) {
        ans_2 += c*y*2;
        if(x >= y) {
          ans_2 += (x-y)*a;
        }
      } else if (b > a) {
        ans_2 += c*x*2;
        if(y >= x) {
          ans_2 += (y-x)*b;
        }
      } else {
        tmp_1 += c*y*2;
        if(x > y) {
          tmp_1 += (x-y)*a;
        }
        tmp_2 += c*x*2;
        if(y > x) {
          tmp_2 += (y-x)*b;
        }
        ans_2 = Math.min(tmp_2,tmp_1);
      }

      System.out.println(Math.min(ans_1,ans_2));
  }
}