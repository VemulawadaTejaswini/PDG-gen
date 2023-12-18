import java.util.*;

public class Main {
  public static void main(String[] args) {
    List<Integer> targetList = new ArrayList<Integer>();

    createNumsList(targetList);
    improvedBubbleSort(targetList);

    printResult(targetList);
  }

  private static void createNumsList(List<Integer> targetList) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
      targetList.add(sc.nextInt());
    }
  }

  private static void improvedBubbleSort(List<Integer> targetList) {
    boolean swapped = false;
    for (int i = 0; i < 3; i++) {
      swapped = false;
      for (int j = i; j < 3; j++) {
        if (targetList.get(i) > targetList.get(j)) {
          swap(targetList, i, j);
          swapped = true;
        }
      }
      if (!swapped) {
        break;
      }
    }
  }

  private static void swap(List<Integer> targetList, int x, int y) {
    int temp = targetList.get(x);
    targetList.set(x, targetList.get(y));
    targetList.set(y, temp);
  }

  private static void printResult(List<Integer> targetList) {
    int sizeOfList = targetList.size();
    for (int i = 0; i < sizeOfList; i++) {
      System.out.print(targetList.get(i));
      if (i != sizeOfList-1) {
        System.out.print(" ");
      }
    }
    System.out.println();
  }
}