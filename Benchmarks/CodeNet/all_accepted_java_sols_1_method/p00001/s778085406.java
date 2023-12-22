import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] ms = new int[10];
    for (int ii = 0; ii < 10; ii++) {
      ms[ii] = scanner.nextInt();
    }
    java.util.Arrays.sort(ms);
    System.out.println(ms[9]);
    System.out.println(ms[8]);
    System.out.println(ms[7]);
  }
}