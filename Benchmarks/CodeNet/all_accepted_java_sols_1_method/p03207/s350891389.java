import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int syouhinsu = sc.nextInt();
    int[] syouhin = new int[syouhinsu];
    for (int i = 0; i < syouhin.length; i++) {
      syouhin[i] = sc.nextInt();
    }
    int max = 0;
    int syohinnunber = -1;
    int sum = 0;
    for (int i = 0; i < syouhin.length; i++) {
      if (syouhin[i] > max) {
        max = syouhin[i];
        syohinnunber = i;
      }
    }
    syouhin[syohinnunber] = max / 2;
    for (int i = 0; i < syouhin.length; i++) {
      sum += syouhin[i];
    }
    System.out.println(sum);
  }

}
