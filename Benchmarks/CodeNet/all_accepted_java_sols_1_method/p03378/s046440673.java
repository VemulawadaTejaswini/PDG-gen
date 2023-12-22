import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numOfTr = sc.nextInt();
    int numOfCost = sc.nextInt();
    int current = sc.nextInt();
    int[] cost = new int[numOfCost];
    for (int i = 0; i < numOfCost; i++) {
      cost[i] = sc.nextInt();
    }
    int left = 0;
    int right = 0;
    for (int i = 0; i < current; i++) {
      for (int j = 0; j < numOfCost; j++) {
        if (i == cost[j]) {
          left++;
        }
      }
    }
    for (int i = current + 1; i < numOfTr + 1; i++) {
      for (int j = 0; j < numOfCost; j++) {
        if (i == cost[j]) {
          right++;
        }
      }
    }
    System.out.println(left < right ? left : right);
  }

}
