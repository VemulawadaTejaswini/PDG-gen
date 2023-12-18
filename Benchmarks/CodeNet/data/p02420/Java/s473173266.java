import java.util.Scanner;
public class Main {

  public static void reverseSubarray(String[] ary, int i, int j) {
    while (i < j) {
      String temp = ary[i];
      ary[i] = ary[j];
      ary[j] = temp;
      i++;
      j--;
    }
  }

  public static void shuffle(String[] ary, int h) {
    // reverse up to h
    reverseSubarray(ary, 0, h-1);
    // reverse h to end
    reverseSubarray(ary, h, ary.length-1);
    // reverse entire ary
    reverseSubarray(ary, 0, ary.length-1);
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String deck = s.next();
    while (!deck.equals("-")) {
      String[] deckAry = deck.split("");
      int nShuffles = s.nextInt();
      for (int i = 0; i < nShuffles; i++) {
        int h = s.nextInt();
        shuffle(deckAry, h);
      }
      System.out.println(String.join("", deckAry));
      deck = s.next();
    }
    s.close();
  }
}

