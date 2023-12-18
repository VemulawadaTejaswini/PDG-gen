import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());

    long sumIn = 0;
    Map<Long, Integer> sumMap = new HashMap<>();
    sumMap.put((long) 0, 1);
    long count = 0;
    for (int i = 0; i < N; i++) {
      sumIn += Integer.parseInt(sc.next());
      sumMap.merge(sumIn, 1, Integer::sum);
      count += sumMap.get(sumIn) - 1;
    }
    System.out.println(count);
  }
}