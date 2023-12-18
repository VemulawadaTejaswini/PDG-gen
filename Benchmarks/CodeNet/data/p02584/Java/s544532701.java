import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = Math.abs(sc.nextLong());
    long k = sc.nextLong();
    long d = sc.nextLong();
    sc.close();
    long cnt = x / d;
    x = x - (d * Math.min(k, cnt));
    if(cnt >= k){
      System.out.println(x);
    } else {
      k -= cnt;
      if(k % 2 == 0){
        System.out.println(x);
      } else {
        System.out.println(Math.abs(x - d));
      }
    }
  }
}