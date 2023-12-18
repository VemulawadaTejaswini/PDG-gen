import java.util.Scanner;

public class Main {
  static boolean isStable = true;

  public static class Card {
    private String suit;
    private int number;

    public Card(String suit, int number) {
      this.suit = suit;
      this.number = number;
    }   

    public String toString() {
      StringBuilder builder = new StringBuilder();
      builder.append(suit);
      builder.append(" ");
      builder.append(number);

      return builder.toString();
    }   
  }

  private static int partition(Card[] array, int left, int right) {
    Card pivot = array[(left + right)/2];

    while (left <= right) {
      while (array[left].number < pivot.number) left++;
      while (array[right].number > pivot.number) right--;

      if (left <= right) {
        swap(array, left, right);
        left++;
        right--;
      }   
    }   
    return left;
  }

  private static void quickSort(Card[] array, int left, int right) {
    int index = partition(array, left, right);
    if (left < index - 1) {
      quickSort(array, left, index - 1); 
    }   
    if (index < right) {
      quickSort(array, index, right);
    }   
  }

  private static void swap(Card[] array, int i, int j) {
    Card tmp = array[j];
    array[j] = array[i];
    array[i] = tmp;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.next();

    int N = Integer.valueOf(str);

    Card[] cards = new Card[N];
    for (int i = 0; i < N; i++) {
      cards[i] = new Card(scan.next(), scan.nextInt());
    }

    quickSort(cards, 0, cards.length - 1);

    Card prev = cards[0];
    for (int i = 1; i < N; i++) {
      Card next = cards[i];
      if (next.number == prev.number) {
        isStable = false;
      }   
      prev = next;
    } 

    StringBuilder builder = new StringBuilder();
    if (isStable) {
      builder.append("Stable");
      builder.append("\n");
    } else {
      builder.append("Not stable");
      builder.append("\n");
    }
    for (int i = 0; i < N; i++) {
      builder.append(cards[i].toString());
      builder.append("\n");
    }
    System.out.println(builder.toString().trim());

  }
}