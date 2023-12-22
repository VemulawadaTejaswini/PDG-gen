import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    // 番号の取得
    long num = sc.nextLong();

    // 総和
    long sum = 0;

    for (long i=1; i <= num; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        continue;
      } else {
        sum += i;
      }
    }
    System.out.println(sum);
  }
}