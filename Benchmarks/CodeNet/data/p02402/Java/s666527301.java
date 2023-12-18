import java.util.*;

public class Main {
  public static void main(String[] args) {
    List<Integer> numsList = new ArrayList<Integer>();

    createNumsList(numsList);

    System.out.println(String.format("%ld %ld %ld", getSmallestVal(numsList),
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

  private static long getSmallestVal(List<Integer> numsList) {
    long minVal = 1000000;
    for (int num : numsList) {
      if (num < minVal) {
        minVal = num;
      }
    }
    return minVal;
  }

  private static long getLargestVal(List<Integer> numsList) {
    long maxVal = -1000000;
    for (int num : numsList) {
      if (num > maxVal) {
        maxVal = num;
      }
    }
    return maxVal;
  }

  private static long getSummation(List<Integer> numsList) {
    long result = 0;
    for (int num : numsList) {
      result += num;
    }
    return result;
  }
}