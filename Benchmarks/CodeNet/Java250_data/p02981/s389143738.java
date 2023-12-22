import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int number = sc.nextInt();
    int train = sc.nextInt();
    int taxi = sc.nextInt();

    int caseTrain = number * train;

    if(caseTrain < taxi) {
      System.out.println(caseTrain);
    } else {
      System.out.println(taxi);
    }
  }
}