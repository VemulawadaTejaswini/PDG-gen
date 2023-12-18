import java.util.*;

public class Main {
  public static void main(String[] args) {
    List<Integer> numsList = new ArrayList<Integer>();

    createNumsList(numsList);

    System.out.println(String.format("%d %d %d",  getSmallestVal(numsList),
                                                  getLargestVal(numsList),
                                                  getSummation(numsList)));
  }

  private static void createNumsList(List<Integer> numsList) {
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();

    for (int i = 0; i < count; i++) {
      numsList.add(sc.nextInt());
    }
  }

  private static int getSmallestVal(List<Integer> numsList) {
    int minVal = 1000000;
    for (int num : numsList) {
      if (num < minVal) {
        minVal = num;
      }
    }
    return minVal;
  }

  private static int getLargestVal(List<Integer> numsList) {
    int maxVal = -1000000;
    for (int num : numsList) {
      if (num > maxVal) {
        maxVal = num;
      }
    }
    return maxVal;
  }

  private static int getSummation(List<Integer> numsList) {
    int result = 0;
    for (int num : numsList) {
      result += num;
    }
    return result;
  }
}