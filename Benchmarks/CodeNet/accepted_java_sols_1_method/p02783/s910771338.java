import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int h[] = new int[2];
    for (int j = 0; j < 2; j++) {
      h[j] = scan.nextInt();
    }
    int c =1;
    for (int i = 1; h[1] < h[0]; i++) {
      h[0] -= h[1];
      c++;
    }
    System.out.println(c);
  }
}