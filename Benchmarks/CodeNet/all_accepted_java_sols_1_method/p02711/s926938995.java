import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      char[] N = sc.next().toCharArray();
      String result = "No";
      if (N[0] == '7' || N[1] == '7' || N[2] == '7')
        result = "Yes";
      System.out.println(result);
    }
  }
}
