import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

  public static void main(String[] args) {
    // printTestValue();
    dTest();
  }

  public static void dTest() {
    long startTime = System.currentTimeMillis();
    d();
    long endTime = System.currentTimeMillis();
    System.out.println("処理時間：" + (endTime - startTime) + " ms");
  }

  public static void d() {

    try (Scanner sc = new Scanner(System.in)) {
      int listSize = Integer.parseInt(sc.next());
      Map<Integer, Boolean> numMap = new TreeMap<Integer, Boolean>();
      for (int x = 0; x < listSize; x++) {
        numMap.put(Integer.parseInt(sc.next()), false);
      }
      Boolean firstFlg = true;
      int checkNumber = 0;
      Boolean appryFlg = true;
      for (Map.Entry<Integer, Boolean> entry : numMap.entrySet()) {
        if (firstFlg) {
          checkNumber = entry.getKey();
          firstFlg = false;

        }
      }
    } catch (Exception e) {
      System.out.println("エラー");
    }
  }
  //
  // void tempCode() {
  // try (Scanner sc = new Scanner(System.in)) {
  // int a = Integer.parseInt(sc.next());
  // String b = sc.next();
  // }
  // }

  public static void printTestValue() {
    int valueA = (int) (2 * Math.pow(10d, 5d));
    int valueB = (int) Math.pow(10d, 6d);
    System.out.println(valueA);
    for (int x = 0; x < valueA; x++) {
      System.out.println(Math.round(Math.random() * valueB));
    }
  }
}
