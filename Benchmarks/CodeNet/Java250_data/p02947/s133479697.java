import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] data = new String[n];

    HashMap<String, Long> map = new HashMap<>();

    long count = 0;

    for (int i = 0; i < n; i++) {
      data[i] = sc.next();
    }

    for (int i = 0; i < n; i++) {
      char[] temp = data[i].toCharArray();
      Arrays.sort(temp);
      String str = String.valueOf(temp);
      if (map.containsKey(str)) {
        long k = map.get(str);
        count += k;
        map.put(str,k+1);
      } else {
        map.put(str,(long)1);
      }
    }

    System.out.println(count);


  }

}
