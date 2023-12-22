import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number, i, sum = 0, tmp = -1;
    number = Integer.parseInt(sc.next());
    int[] array_a = new int[number];
    int[] array_b = new int[number-1];
    for(i = 0; i < number-1; i++) {
      array_b[i] = Integer.parseInt(sc.next());
    }
    array_a[0] = array_b[0];
    for(i = 1; i < number-1; i++) {
      array_a[i] = Math.min(array_b[i-1], array_b[i]);
    }
    array_a[i] = array_b[i-1];
    for(i = 0; i < number; i++) {
      sum += array_a[i];
    }
    System.out.println(sum);
  }
}
