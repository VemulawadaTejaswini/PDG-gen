import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int keirosu = sc.nextInt();
    int limit = sc.nextInt();
    int[] cost = new int[keirosu];
    int[] time = new int[keirosu];
    for (int i = 0; i < keirosu; i++) {
      cost[i] = sc.nextInt();
      time[i] = sc.nextInt();
    }
    int min = Integer.MAX_VALUE;
    boolean tle = false;
    for (int i = 0; i < keirosu; i++) {
      if (time[i] <= limit && cost[i] < min) {
        min = cost[i];
        tle = true;
      }
    }
    System.out.println(tle ? min : "TLE");
  }

}
