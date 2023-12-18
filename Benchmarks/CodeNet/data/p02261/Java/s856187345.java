import java.util.Scanner;

public class Main {
  static int i, j, k;
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Scanner scanString = new Scanner(System.in);
    int N = Integer.parseInt(scanner.nextLine());
    Card[] cards_1 = new Card[N];
    Card[] cards_2 = new Card[N];
    String[] str = scanner.nextLine().split(" ");
    for(i = 0; i < N; i++){
       char[] chr = str[i].toCharArray();
       cards_1[i] = new Card(chr[0], Character.getNumericValue(chr[1]));
       cards_2[i] = new Card(chr[0], Character.getNumericValue(chr[1]));
    }
    bubble(cards_1);
    select(cards_2);
  }

  public static void bubble(Card[] cards){
    for(i = 0; i < cards.length; i++){
      for(j = cards.length - 1; j > i; j--){
        if(cards[j].value < cards[j-1].value){
          Card dum = cards[j];
          cards[j] = cards[j-1];
          cards[j-1] = dum;
        }
      }
    }
    print(cards);
    System.out.println("Stable");
  }

  public static void select(Card[] cards){
    String stability = "Stable";
    for(i = 0; i < cards.length - 1; i++){
      int min = i;
      for(j = i; j <= cards.length - 1; j++){
        if(cards[min].value > cards[j].value){
          min = j;
        }
      }
      if(min != i){
        Card dum = cards[min];
        cards[min] = cards[i];
        cards[i] = dum;
        if(i+1 != min){
          for(k = i+1; k < min; k++){
            if((cards[i].value == cards[k].value) || (cards[min].value == cards[k].value)) stability = "Not stable";
          }
        }
      }
    }
    print(cards);
    System.out.println(stability);
  }

  public static void print(Card[] cards){
    for(i = 0; i < cards.length - 1; i++){
      System.out.print(cards[i].suit);
      System.out.print(cards[i].value + " ");
    }
    System.out.print(cards[cards.length-1].suit);
    System.out.println(cards[cards.length-1].value);
  }

  static class Card {
    char suit;
    int value;

    Card(char suit, int value){
      this.suit = suit;
      this.value = value;
    }
  }
}

