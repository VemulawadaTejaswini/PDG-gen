import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int d = sc.nextInt();
    String ans = "Christmas";

    for (int i = d - 25; i < 0; i++) {
      ans += " Eve";
    }

    System.out.println(ans);

  }
}