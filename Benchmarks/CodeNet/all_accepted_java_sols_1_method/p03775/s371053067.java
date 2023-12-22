import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long k = scan.nextLong();

    int t1 = (int) Math.sqrt(k);

    if (t1*t1 == k){
      String t = t1+"";
      int g = t.length();
      System.out.println(g);
      return;
    }

    for (int i=t1;i>=1;i--){
      if (k % i == 0){
        long q = (long) k/i;
        String a1 = q+"";
        System.out.println(a1.length());
        return;
      }
    }

  }

}
