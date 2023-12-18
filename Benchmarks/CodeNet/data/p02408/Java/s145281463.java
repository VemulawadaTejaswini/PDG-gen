import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
  public static class Deck {

    HashMap<String, HashSet<Integer>> cards = new HashMap<String, HashSet<Integer>>();

    public Deck() {
      // Spades, Hearts, Clubs, Diamonds
      this.cards.put("S", generateSet());
      this.cards.put("H", generateSet());
      this.cards.put("C", generateSet());
      this.cards.put("D", generateSet());
    }

    public static HashSet<Integer> generateSet() {
      HashSet<Integer> set = new HashSet<Integer>();
      for (int i = 1; i <= 13; i++) {
        set.add(i);
      }
      return set;
    }

    public void removeCard(String suit, int rank) {
      HashSet<Integer> set = this.cards.get(suit);
      set.remove(rank);
    }

    public void displayRemaining_helper(String suit) {
      HashSet<Integer> set = this.cards.get(suit);
      List<Integer> remainingCards = new ArrayList<Integer>(set);
      Collections.sort(remainingCards);
      for (int rank : remainingCards) {
        System.out.println(suit + " " + rank);
      }
    }

    public void displayRemaining() {
      this.displayRemaining_helper("S");
      this.displayRemaining_helper("H");
      this.displayRemaining_helper("C");
      this.displayRemaining_helper("D");
    }
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Deck cards = new Deck();
    int n = s.nextInt();
    for (int i = 0; i < n; i++) {
      cards.removeCard(s.next(), s.nextInt());
    }
    s.close();
    cards.displayRemaining();
  }
}

