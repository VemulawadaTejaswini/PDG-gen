
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String readStr;

    Integer[] primesArr;
    LinkedList<Integer> primes = new LinkedList<Integer>();

    int MAX = 1000000;

    //とりあえず2で割れない数を追加。2も素数なので2も入れる。
    primes.add(2);
    for (int i = 3; i < MAX; i += 2) {
      primes.add(i);
    }

    int m = 3;
    double s = Math.sqrt(MAX);
    int c = 0;
    do {
      Iterator<Integer> it = primes.iterator();
      while (it.hasNext()) {
        int num = it.next();
        if (num % m == 0 && num != m)
          it.remove();
      }
      m = primes.get(c);
      c++;
    } while (m < s);

    primesArr = primes.toArray(new Integer[0]);

    while ((readStr = reader.readLine()) != null && !"".equals(readStr)) {
      int readInt = Integer.parseInt(readStr);
      int count = 0;
      for (Integer i : primes) {
        if (i > readInt)
          break;
        count++;
      }
      System.out.println(count);
    }
  }

}