import java.util.Scanner;

class Main{
  static class Card{
    char ch;
    int num;
  }

  static void trace(Card[] cards){
    int i;
    for(i = 0; i < cards.length - 1; i++){
      System.out.print(cards[i].ch);
      System.out.print(cards[i].num + " ");
    }
    System.out.print(cards[i].ch);
    System.out.println(cards[i].num);
  }

  static void bubbleSort(Card[] c){
    for(int i = 0; i < c.length; i++){
      for(int j = c.length - 1; j > i; j--){
        if(c[j].num < c[j-1].num){
          Card tmp = c[j];
          c[j] = c[j-1];
          c[j-1] = tmp;
        }
      }
    }
  }

  static void selectionSort(Card[] c){
    for(int i = 0; i < c.length; i++){
      int m = i;
      for(int j = i + 1; j < c.length; j++){
        if(c[m].num > c[j].num)
          m = j;
      }
      Card tmp = c[i];
      c[i] = c[m];
      c[m] = tmp;
    }
  }

  static boolean isEqual(Card[] c1, Card[] c2){
    if(c1.length != c2.length)return false;
    for(int i = 0; i < c1.length; i++)
      if(!(c1[i].num == c2[i].num && c1[i].ch == c2[i].ch))
        return false;
    return true;
  }

  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    int n = stdIn.nextInt();
    Card[] cards1 = new Card[n];
    Card[] cards2 = new Card[n];
    for(int i = 0; i < n; i++){
      String input = stdIn.next();
      char ch = input.charAt(0);
      int num = Integer.parseInt(input.substring(1));
      cards1[i] = new Card();
      cards1[i].ch = ch;
      cards1[i].num = num;

      cards2[i] = new Card();
      cards2[i].ch = ch;
      cards2[i].num = num;
    }

    bubbleSort(cards1);
    trace(cards1);
    if(isEqual(cards1, cards1))
      System.out.println("Stable");
    else
      System.out.println("Not stable");
    selectionSort(cards2);
    trace(cards2);
    if(isEqual(cards1, cards2))
      System.out.println("Stable");
    else
      System.out.println("Not stable");

  }
}