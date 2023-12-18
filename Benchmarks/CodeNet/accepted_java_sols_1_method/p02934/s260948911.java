import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i, number;
    number = Integer.parseInt(sc.next());
    int[] values = new int[number];
    double answer, sum = 0.0;
    for(i = 0; i < number; i++) values[i] = Integer.parseInt(sc.next());
    for(i = 0; i < number; i++) {
      sum += 1.0 / values[i];
    }
    answer = 1.0 / sum;
    System.out.println(answer);
  }
}
