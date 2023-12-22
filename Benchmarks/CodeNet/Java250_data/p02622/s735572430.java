import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // abc173_a();
    // abc173_b();
    // abc173_c();
    // abc172_a();
    abc172_b();
  }

  // int 2147483648 [ 2 * 10(9)]
  // long 9223372036854775808 [ 9 * 10(18)]

  public static void abc172_a() {
    try (Scanner sc = new Scanner(System.in)) {
      int a = parseI(sc.next());

      System.out.println(a + (int) Math.pow(a, 2) + (int) Math.pow(a, 3));
    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  public static void abc172_b() {
    try (Scanner sc = new Scanner(System.in)) {
      String s = sc.next();
      String t = sc.next();
      int ansCnt = 0;
      for (int i = 0; i < s.length(); i++) {
        if (!parseS(s.charAt(i)).equals(parseS(t.charAt(i)))) {
          ansCnt++;
        }
      }
      System.out.println(ansCnt);

    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

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
      final String[] err = { "AC", "WA", "TLE", "RE" };
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

  public static void abc173_c() {
    try (Scanner sc = new Scanner(System.in)) {
      int row = parseI(sc.next());
      int column = parseI(sc.next());
      int checkBlackCount = parseI(sc.next());
      int existBlack = 0;
      int ansCount = 0;
      int[][] inputList = new int[row][column];
      String input = "";
      for (int i = 0; i < row; i++) {
        input = sc.next();
        for (int x = 0; x < column; x++) {
          inputList[i][x] =
            parseI(parseS(input.charAt(x)).replace(".", "0").replace("#", "1"));
        }
      }

      for (int i = 0; i < (1 << row); i++) {
        for (int x = 0; x < (1 << column); x++) {

          for (int chRownum = 0; chRownum < row; chRownum++) {
            for (int chColNum = 0; chColNum < column; chColNum++) {
              if (inputList[chRownum][chColNum] == 1
                && ((i >> chRownum) & 1) == 0 && ((x >> chColNum) & 1) == 0) {
                existBlack++;
              }
            }
          }
          if (existBlack == checkBlackCount) ansCount++;
          existBlack = 0;

        }
      }
      System.out.println(ansCount);

    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  public static int parseI(String value) {
    return Integer.parseInt(value);
  }

  public static double parseD(String value) {
    return Double.parseDouble(value);
  }

  public static <T> String parseS(T value) {
    return String.valueOf(value);
  }
}
