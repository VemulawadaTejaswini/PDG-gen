import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // printTestValue();
    d();
  }

  public static void d() {
    try (Scanner sc = new Scanner(System.in)) {
      int listSize = Integer.parseInt(sc.next());
      List<Integer> numList = new ArrayList<Integer>();
      for (int x = 0; x < listSize; x++) {
        numList.add(Integer.parseInt(sc.next()));
      }
      Collections.sort(numList);

      int applyCount = 0;

      while (!numList.isEmpty()) {
        Boolean notRepeatFlg = true;
        int checkNumber = numList.get(0);
        numList.remove(0);
        List<Integer> removeList = new ArrayList<Integer>(numList);
        int checkCount = 0;
        for (int checkNum : numList) {
          if (checkNum == checkNumber) {
            removeList.remove(checkCount);
            notRepeatFlg = false;
            break;
          } else if (checkNum % checkNumber == 0) {
            removeList.remove(checkCount);
          } else {
            checkCount++;
          }
        }
        numList.clear();
        numList.addAll(removeList);
        if (notRepeatFlg) {
          applyCount++;
        }
      }
      System.out.println(applyCount);
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
