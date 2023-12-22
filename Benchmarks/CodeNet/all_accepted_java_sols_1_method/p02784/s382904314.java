import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int h = input.nextInt();
    int n = input.nextInt();
    int sum = 0;
    for (int i = 0; i < n; i++) {
      int temp = input.nextInt();
      sum += temp;
    }
    if (sum >= h) {
      System.out.print("Yes");
    } else {
      System.out.println("No");
    }
  }

}
