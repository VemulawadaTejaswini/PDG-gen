import java.util.HashMap;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    long n = sc.nextLong();
    HashMap<Long, Integer> map = new HashMap<Long, Integer>();
    long res = 0;

    if (isPrime(n)) {
      System.out.println(1);
      return;
    }

    long devideNum = 2;
    while (n % devideNum == 0) {
      if (map.containsKey(devideNum)) {
        map.put(devideNum, (map.get(devideNum)) + 1);
      } else {
        map.put(devideNum, 1);
      }
      n /= 2;
    }

    devideNum++;
    while ((n != 1) && (devideNum <= n)) {
      if (isPrime(devideNum)) {
        while (n % devideNum == 0) {
          if (map.containsKey(devideNum)) {
            map.put(devideNum, (map.get(devideNum)) + 1);
          } else {
            map.put(devideNum, 1);
          }
          n /= devideNum;
        }
        devideNum += 2;
      } else {
        devideNum += 2;
      }
    }

    for (long key : map.keySet()) {
      int tmp = map.get(key);
      int i = 1;
      while (true) {
        if (tmp - i >= 0) {
          tmp -= i;
          i++;
          res++;
        } else {
          break;
        }
      }
    }
    System.out.println(res);

  }

  static boolean isPrime(long n) {

    if (n >= 2) {
      for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
          return false;
        }
      }
      return true;
    } else {
      return false;
    }
    
  }
}