import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
  private static String marks = "SHCD";

  public static void main(String args[] ) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());
    Card[] cards = new Card[count];
    for (int n = 0; n < count; n++) {
      cards[n] = new Card(br.readLine());
    }
    Arrays.sort(cards, Comparator.comparing(Card::bySort));

    for (int mark = 0; mark < 4; mark++) {
      for (int num = 1; num < 14; num++) {
        if (cards[count - 1].toString().equals(marks.charAt(0) + " " + num)){
          count--;
        } else {
          System.out.println(cards[count - 1]);
        }
      }
    }
  }

  private static class Card {
    String mark;
    int num;
    Card(String str) {
      mark = str.split(" ")[0];
      num = Integer.parseInt(str.split(" ")[1]);
    }

    public String bySort(){
      return marks.indexOf(mark) + " " + (num < 10 ? ("0" + num) : num);
    }

    public String toString(){
      return mark + " " + (num < 10 ? ("0" + num) : num);
    }
  }
}