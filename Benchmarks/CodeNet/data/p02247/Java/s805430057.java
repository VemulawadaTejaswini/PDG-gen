import java.util.Scanner;
public class Main {

  public static boolean find(String w, String t, int i) {
    int j = 0;
    while (j < w.length()) {
      if (i >= t.length())
        return false;
      if (w.charAt(j) != t.charAt(i))
        return false;
      i++;
      j++;
    }
    return true;
  }

  public static void count(String w, String t) {
    // t = t.toLowerCase();
    int i = 0;
    boolean found = false;
    while (i < t.length()) {
      if (t.charAt(i) == w.charAt(0)) {
        found = find(w, t, i);
        if (find(w, t, i))
          System.out.println(i);
      }
      i++;
    }
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String text = s.nextLine();
    String w = s.next();
    s.close();
    count(w, text);
  }

}

