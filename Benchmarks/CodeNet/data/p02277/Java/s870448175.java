import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
  
    new Main().run();
  }

  public void run() {

    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(br.readLine());
      Card[] cards = new Card[n];
      char suit;
      int  value;

      for ( int i=0; i<n; i++ ) {
        suit = (char)br.read(); br.skip(1);
        value = Integer.parseInt(br.readLine());
        cards[i] = new Card(suit, value, i);
      }

      quickSortOfCards(cards, 0, n-1);
      dispCardArray(cards);
    }
    catch(IOException e) {
      System.out.println("IOException!");
    }
  }

  public void quickSortOfCards(Card[] card, int p, int r) {

    if( p < r) {
      int q = partitionOfCards(card, p, r);
      quickSortOfCards(card, p, q-1);
      quickSortOfCards(card, q+1, r);
    }
  }

  public int partitionOfCards(Card[] card, int p, int r) {

    int x = card[r].value;
    int i = p-1;
    Card t;

    for(int j=p; j<r; j++) {
      if(card[j].value <= x) {
        t = card[++i]; card[i] = card[j]; card[j] = t;
      }
    }
    t = card[i+1]; card[i+1] = card[r]; card[r] = t;

    return i+1;
  }

public void dispCardArray(Card[] target) {
  StringBuilder s = new StringBuilder();
  int l=target.length;
  boolean isStable = true;
  String sortState = "Stable";

  s.append(target[0]).append("\n");
  for (int i=1; i<l; i++) {
    s.append(target[i]).append("\n");
    if(isStable && target[i-1].value == target[i].value 
      && target[i-1].storedNo > target[i].storedNo) {
      sortState = "Not stable";
      isStable = false;
    }
  }

  System.out.println(sortState);
  System.out.print(s);
  }
}

class Card {
  char suit;
  int value;
  int storedNo;

  public Card( char suit, int value, int storedNo ) {
    this.suit  = suit;
    this.value = value;
    this.storedNo = storedNo;
  }
  public Card( Card card ) {
    this(card.suit, card.value, card.storedNo);
  }

  @Override
  public String toString() {
    return suit + " " + String.valueOf(value);
  }
}
