import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Main {
  public static void main(String[] args ){

    Scanner sc = new Scanner(System.in);

    int P = sc.nextInt();
    int Q = sc.nextInt();
    int R = sc.nextInt();

    // a <-> b = P
    // b <-> c = Q
    // c <-> a = R

    int minTime = 1001;

    minTime = Math.min(minTime, Q + R);
    minTime = Math.min(minTime, P + R);
    minTime = Math.min(minTime, P + Q);
    System.out.println(minTime);
  }
}
