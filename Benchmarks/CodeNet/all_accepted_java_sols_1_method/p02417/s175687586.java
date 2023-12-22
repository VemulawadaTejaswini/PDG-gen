import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PrintWriter pw = new PrintWriter(System.out);

    Map<Character, Integer> cmap = new HashMap<>(); 
    for (char c = 'a'; c <= 'z'; c++) {
        cmap.put(c, 0);
    }
    
    StringBuffer sb = new StringBuffer();
    while (sc.hasNext()) {
        sb.append(sc.nextLine());
    }

    char[] cs = sb.toString().toLowerCase().toCharArray();
    for (char c : cs) {
        if (Character.isAlphabetic(c)) {
            cmap.put(c, cmap.get(c) + 1);
        }
    }

    for (char c = 'a'; c <= 'z'; c++) {
        pw.println(c + " : " + cmap.get(c));
    }

    pw.flush();
  }
}
