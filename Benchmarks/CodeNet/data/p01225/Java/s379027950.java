import java.util.Scanner;


public class Card {
  public int f;
  public int n;
  public String c;

  Card() {
    f = 0;
  }

  void setSet(int _f) {
    f = _f;
  }

  void setN(int _n) {
    n = _n;
  }

  void setC(String _c) {
    c = _c;
  }

  static int sub(Card x, Card y) {
    if(x.f == y.f) {
      if(x.c.equals(y.c)) {
        return x.n - y.n;
      } else {
        return x.c.charAt(0) - y.c.charAt(0);
      }
    } else {
      return x.f - y.f;
    }
  }

  static void sort(Card[] cards) {
    for(int i = 0; i < 9 - 1; i++) {
      for(int j = 9 - 1; j > i; j--) {
        if(sub(cards[j - 1], cards[j]) > 0) {
          Card temp = cards[j - 1];
          cards[j - 1] = cards[j];
          cards[j] = temp;
        }
      }
    }
  }

  static boolean isSameNumberSet(Card x, Card y, Card z) {
    if(x.c.equals(y.c) && y.c.equals(z.c)) {
      if(x.n == y.n && y.n == z.n) {
        return true;
      }
    }
    return false;
  }

  static boolean isSerialNumberSet(Card x, Card y, Card z) {
    if(x.c.equals(y.c) && y.c.equals(z.c)) {
      if(z.n - y.n == 1 && y.n - x.n == 1) {
        return true;
      }
    }
    return false;
  }

  static void printDebugInfo(String message, Card[] cards) {
    boolean debug = false;
    if(debug) {
      System.out.println("After Input.");
      if(cards != null) {
        for(int i = 0; i < 9; i++) {
          System.out.print(cards[i].c);
          System.out.print(cards[i].n);
          System.out.print(" ");
          System.out.print(cards[i].f);
          System.out.println("");
        }
      }
      System.out.println("");
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    for(int i = 0; i < t; i++) {
      int setCount = 0;

      Card[] cards = new Card[9];
      for(int j = 0; j < 9; j++) {
        cards[j] = new Card();
      }

      // data input
      for(int j = 0; j < 9; j++) {
        cards[j].setN(sc.nextInt());
      }
      for(int j = 0; j < 9; j++) {
        cards[j].setC(sc.next());
      }

      printDebugInfo("After Input.", cards);

      // sort
      Card.sort(cards);

      printDebugInfo("After first sort.", cards);

      // 3?????????????????????????????°????????¢???????????????
      for(int j = 0; j < 7; j++) {
        if(cards[j].f == 1 || cards[j + 1].f == 1 || cards[j + 2].f == 1) {
          continue;
        }
        if(isSameNumberSet(cards[j], cards[j + 1], cards[j + 2])) {
          printDebugInfo("set! " + j + " " + (j + 1) + " " + (j + 2), null);
          cards[j    ].f = 1;
          cards[j + 1].f = 1;
          cards[j + 2].f = 1;
          setCount++;
        }
      }

      printDebugInfo("After enumerate same number set.", cards);

      // sort
      Card.sort(cards);

      printDebugInfo("After second sort.", cards);

      for(int j = 0; j < 7; j++) {
        if(cards[j].f == 1 || cards[j + 1].f == 1 || cards[j + 2].f == 1) {
          continue;
        }
        if(isSerialNumberSet(cards[j], cards[j + 1], cards[j + 2])) {
          printDebugInfo("set! " + j + " " + (j + 1) + " " + (j + 2), null);
          cards[j    ].f = 1;
          cards[j + 1].f = 1;
          cards[j + 2].f = 1;
          setCount++;
        }
      }

      printDebugInfo("Final.", cards);

      if(setCount >= 3) {
        System.out.println(1);
      } else {
        System.out.println(0);
      }

      printDebugInfo("", null);
    }
  }
}