import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int s = sc.next().length();

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s; i++) {
      sb.append("x");
    }

    System.out.println(sb.toString());

    sc.close();
  }
}