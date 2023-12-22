import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  public static void main(final String[] args) throws Exception {
    try (BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      String s = r.readLine();
      String[] a = s.split(" ");
      int tHP = Integer.parseInt(a[0]);
      int tATK = Integer.parseInt(a[1]);
      int aHP = Integer.parseInt(a[2]);
      int aATK = Integer.parseInt(a[3]);
      int tk = (tHP - 1) / aATK;
      int ao = (aHP - 1) / tATK;
      if (tk >= ao) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}