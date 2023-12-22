import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] number = new int[3];
    number[0] = Integer.parseInt(sc.next());
    number[1] = Integer.parseInt(sc.next());
    number[2] = Integer.parseInt(sc.next());
    Arrays.sort(number);
    System.out.println(number[0] + number[1]);
  }
}
