import java.util.Scanner;

public class Main {

  private static int n, input_num, min, max;
  private static long sum;

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    n = stdIn.nextInt();
    input_num = stdIn.nextInt();
    max = input_num;
    min = input_num;
    sum = input_num;
    for (int i = 1;i < n; i++) {
      input_num = stdIn.nextInt();
      if(max < input_num) {
        max = input_num;
      }
      if(min > input_num) {
        min = input_num;
      }
      sum += input_num;
    }

    System.out.println(min + " " + max + " " + sum);

  }
}