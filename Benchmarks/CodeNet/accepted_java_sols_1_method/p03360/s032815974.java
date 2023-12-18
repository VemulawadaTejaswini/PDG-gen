import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int k = sc.nextInt();

    int[] num = new int[3];
    num[0] = a;
    num[1] = b;
    num[2] = c;
    Arrays.sort(num);

    for (int i = 0; i < k; i++) {
      num[2] = num[2] * 2;
    }

    System.out.println(num[0] + num[1] + num[2]);
  }
}