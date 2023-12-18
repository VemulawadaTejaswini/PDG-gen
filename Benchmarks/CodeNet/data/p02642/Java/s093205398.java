import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
      Boolean applyFlg = true;
      int nextInt = 0;
      List<Integer> duplicateList = new ArrayList<Integer>();

      Map<Integer, Boolean> numMap = new TreeMap<Integer, Boolean>();
      for (int x = 0; x < listSize; x++) {
        nextInt = Integer.parseInt(sc.next());
        if (!numMap.containsKey(nextInt)) {
          numMap.put(nextInt, applyFlg);
        } else if (!duplicateList.contains(nextInt)) {
          duplicateList.add(nextInt);
        }
      }

      int skipCount = 0;
      int checkNum = 0;
      Boolean firstRecordFlg = true;
      while (skipCount < numMap.size()) {
        int count = 0;
        for (Map.Entry<Integer, Boolean> entry : numMap.entrySet()) {
          if (count < skipCount) {
            count++;
            continue;
          } else if (firstRecordFlg) {
            checkNum = entry.getKey();
            firstRecordFlg = false;
          } else {
            if (entry.getValue() && entry.getKey() % checkNum == 0) {
              entry.setValue(false);
            }
          }
        }
        firstRecordFlg = true;
        skipCount++;
      }

      Collection<Boolean> flgL = numMap.values();
      int applyCount = 0;

      for (boolean flg : flgL) {
        if (flg) applyCount++;
      }

      System.out.println(applyCount - duplicateList.size());

    } catch (Exception e) {
      System.out.println("エラー" + e);
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
      System.out.println(
        Math.round(Math.random() * Math.random() * Math.random() * valueB
          + Math.random() * 100));
    }
  }
}
