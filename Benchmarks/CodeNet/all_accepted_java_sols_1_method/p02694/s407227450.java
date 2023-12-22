import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();

    long yoki = 100;
    for (int i = 1; i <= 3765; i++){
      yoki = yoki + yoki / 100;
      if (yoki >= x) {
        System.out.println(i);
        return;
      }
    }
  }
}
