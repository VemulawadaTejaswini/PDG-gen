import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // abc173_a();
    abc173_b();
  }

  // int 2147483648 [ 2 * 10(9)]
  // long 9223372036854775808 [ 9 * 10(18)]

  public static void abc173_a() {
    try (Scanner sc = new Scanner(System.in)) {
      int payment = parseI(sc.next());
      int max = 10000;
      int thou = 1000;

      System.out.println((max - payment) % thou);
    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  public static void abc173_b() {
    try (Scanner sc = new Scanner(System.in)) {
      int num = parseI(sc.next());

      // AC
      // WA
      // TLE
      // RE x 0
      int[] ansCount = new int[4];
      String[] err = { "AC", "WA", "TLE", "RE" };
      Arrays.fill(ansCount, 0);

      for (int i = 0; i < num; i++) {
        String ans = sc.next();
        switch (ans) {
          case "AC":
            ansCount[0]++;
            break;
          case "WA":
            ansCount[1]++;
            break;
          case "TLE":
            ansCount[2]++;
            break;
          case "RE":
            ansCount[3]++;
            break;
        }
      }
      int count = 0;
      for (int answer : ansCount) {
        System.out.println(err[count] + " x " + answer);
        count++;
      }
    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  public static int parseI(String value) {
    return Integer.parseInt(value);
  }
}
