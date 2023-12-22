import java.util.*;
import java.io.*;

class Main {
  public static void main(String args[]) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String cards;
    int m = 0;
    int h = 0;
    try {
      while (!(cards = br.readLine()).equals("-")) {
        m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
          h = Integer.parseInt(br.readLine());
          cards = cards.substring(h, cards.length()) + cards.substring(0, h);
        }
        System.out.println(cards);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}