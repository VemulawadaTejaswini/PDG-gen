
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String readStr;

    while ((readStr = reader.readLine()) != null) {
      int[] a = new int[4];
      int[] b = new int[4];
      String[] astrs = readStr.split(" ");
      String[] bstrs = reader.readLine().split(" ");
      for (int i = 0; i < a.length; i++)
        a[i] = Integer.parseInt(astrs[i]);
      for (int i = 0; i < b.length; i++)
        b[i] = Integer.parseInt(bstrs[i]);

      int hit = 0;
      int blow = 0;
      for (int i = 0; i < b.length; i++) {
        if (isBlow(a, b[i], i)) {
          blow++;
          continue;
        }
        if (isHit(a, b[i], i))
          hit++;
      }

      System.out.println(hit + " " + blow);

    }
  }

  public static boolean isHit(int[] array, int num, int index) {
    return array[index] == num;
  }

  public static boolean isBlow(int[] array, int num, int index) {
    if (isHit(array, num, index))
      return false;

    for (int n : array)
      if (n == num)
        return true;

    return false;
  }

}