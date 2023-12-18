import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long n = scan.nextLong();
    long m = scan.nextLong();
    long limit = (long) m/n;
    long max = 1;
    int start = (int) Math.sqrt(m);
    for (int i=start;i>=1;i--){
      if (m%i == 0){
        int m1 = i;
        long m2 = (long) m/i;
        if (m2 > limit){
          m2 = -1;
        }
        if (m1 > limit){
          m1 = -1;
        }
        max = Math.max(max,m1);
        max = Math.max(max,m2);
      }
    }
    System.out.println(max);

  }

}
