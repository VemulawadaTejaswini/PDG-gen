import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int[] m = new int[n];
    int count = 0;
    int min = (int)Math.pow(10, 5);
    for (int i = 0; i < n; i++) {
      m[i] = sc.nextInt();
      x = x - m[i];
      count++;
      if (m[i] < min) {
        min = m[i];
      }
    }
    count = count + x / min;
    System.out.println(count);
  }
}