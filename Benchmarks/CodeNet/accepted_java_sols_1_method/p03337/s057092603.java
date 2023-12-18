import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int add = a + b;
    int delta = a - b;
    int multiply = a * b;
    int[] number = new int[3];
    number[0] = add;
    number[1] = delta;
    number[2] = multiply;
    Arrays.sort(number);
    System.out.println(number[2]);
  }
}