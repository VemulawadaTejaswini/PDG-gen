import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int[] num = new int[3];

    num[0] = a + b;
    num[1] = a - b;
    num[2] = a * b;

    Arrays.sort(num);

    System.out.println(num[2]);
  }
}