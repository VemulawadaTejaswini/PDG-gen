import java.util.Scanner;

public class Main{
  static int x;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    x = sc.nextInt();

    long low = 0, high = Integer.MAX_VALUE / 2;
    while(high - low > 1){
      long mid = (low + high) / 2;
      if(mid * (mid + 1) < 2 * x){
        low = mid;
      }
      else{
        high = mid;
      }
    }

    System.out.println(high);
  }
}