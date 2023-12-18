import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    String t = sc.next();

    int slen = s.length();
    int tlen = t.length();
    int keyStart = -1;
    loop: for (int i = 0; i < slen - tlen + 1; i++) {
      for (int j = 0; j < tlen; j++) {
        if (!(t.substring(j, j + 1).equals(s.substring(i + j, i + j + 1))
            || s.substring(i + j, i + j + 1).equals("?"))) {
          continue loop;
        }
      }
      keyStart = i;
    }
    if (keyStart == -1) {
      System.out.println("UNRESTORABLE");
    } else {
      StringBuilder sb = new StringBuilder(s);
      sb.replace(keyStart, keyStart + tlen, t);

      for (int i = 0; i < slen; i++) {
        if (sb.substring(i, i + 1).equals("?")) {
          sb.replace(i, i + 1, "a");
        }
      }

      System.out.println(sb);
    }

    sc.close();
  }

}