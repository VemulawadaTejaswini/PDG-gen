import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long n = scan.nextLong();
    long count = 0;
    while (true){
      if (fast(count) > n){
        break;
      }
      count += 1;
    }
    System.out.println(fast(count)-1);
  }

  static long fast(long i){
    long ret = 1;
    long base = 2;
    while (i>0){
      if ((i & 1) == 1){
        ret *= base;
      }
      base = base*base;
      i >>= 1;
    }
    return ret;
  }
}
