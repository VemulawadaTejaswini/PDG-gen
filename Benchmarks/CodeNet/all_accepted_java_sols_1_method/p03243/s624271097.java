import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    for (int i = 111; i <= 999; i += 111) {
      if (i >= N) {
        System.out.println(i);
        break;
      }
    }
  }
}
