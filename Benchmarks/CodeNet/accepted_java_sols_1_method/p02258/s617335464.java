import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int max = -2000000000;
    int min = stdIn.nextInt();
    for (int i = 1; i < n; i++) {
      int now = stdIn.nextInt();
      if (now - min > max) 
        max = now - min;
      if (now < min)
        min = now;
    }
    System.out.println(max);
  }
}