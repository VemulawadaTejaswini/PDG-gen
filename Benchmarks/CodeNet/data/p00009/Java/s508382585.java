
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String readStr;

    Integer[] primesArr;
    ArrayList<Integer> primes = new ArrayList<Integer>();
    primes.add(2);
    primes.add(3);
    primes.add(5);
    primes.add(7);
    for (int i = 2; i < 999999; i++) {
      if (!(i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0))
        primes.add(i);
    }
    primesArr = primes.toArray(new Integer[0]);

    while ((readStr = reader.readLine()) != null) {
      int readInt = Integer.parseInt(readStr);
      if (readInt == 1) {
        System.out.println(1);
        continue;
      }
      int count = 0;
      for (Integer prime : primesArr)
        if (prime <= readInt) {
          count++;
        } else
          break;
      System.out.println(count);
    }
  }

}