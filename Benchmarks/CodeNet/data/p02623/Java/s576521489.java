import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // abc173_a();
    // abc173_b();
    // abc173_c();
    // abc172_a();
    // abc172_b();
    abc172_c();
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

  public static void abc172_c() {
    try (Scanner sc = new Scanner(System.in)) {
      int n = parseI(sc.next());
      int m = parseI(sc.next());
      long k = parseL(sc.next());

      int[] nList = new int[n];
      int[] mList = new int[m];

      for (int i = 0; i < n; i++) {
        nList[i] = (parseI(sc.next()));
      }
      for (int i = 0; i < m; i++) {
        mList[i] = (parseI(sc.next()));
      }

      long sum = 0L;
      int ansCnt = 0;

      int nCheck = 0;
      int mCheck = 0;

      while (nList.length != nCheck || mList.length != mCheck) {
        if (mList.length == mCheck
          || nList.length != nCheck && nList[nCheck] < mList[mCheck]) {
          sum += nList[nCheck];
          if (k < sum) {
            break;
          }
          nCheck++;
          ansCnt++;
        } else {
          sum += mList[mCheck];
          if (k < sum) {
            break;
          }
          mCheck++;
          ansCnt++;
        }
      }
      System.out.println(ansCnt);

    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }
  
   public static int parseI(String value) {
    return Integer.parseInt(value);
  }

  public static long parseL(String value) {
    return Long.parseLong(value);
  }

  public static double parseD(String value) {
    return Double.parseDouble(value);
  }

  public static <T> String parseS(T value) {
    return String.valueOf(value);
  }

}
