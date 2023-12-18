import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] array = new int[30];

    int w = scanner.nextInt();
    for (int i = 0; i < w; ++i) array[i] = i + 1;

    int n = scanner.nextInt();

    for (int i = 0; i < n; ++i) {
      int temp, a , b;
      String str = scanner.next();
      String[] num = str.split(",");
      temp = array[a = (Integer.parseInt(num[0]) - 1)];
      array[a] = array[b = (Integer.parseInt(num[1]) - 1)];
      array[b] = temp;
    }

    for (int i = 0; i < w; ++i) System.out.println(array[i]);
  }
}
