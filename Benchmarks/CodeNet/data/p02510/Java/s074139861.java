import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // Scanner sc = new Scanner(System.in);
    String cards = null;
    while (true) {
      cards = sc.readLine();
      if (cards.equals("-")) break;
      int m = Integer.parseInt(br.readLine());
      for (int i = 0; i < m; i++) {
        int h = Integer.parseInt(br.readLine());
        cards = cards.substring(h) + cards.substring(0, h);
      }
    }
    System.out.println(cards);
  }
}