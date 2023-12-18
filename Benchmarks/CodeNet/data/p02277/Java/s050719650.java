import java.util.Scanner;

class Main{
  static class Card{
    String ch;
    int num;

    Card(){}
    Card(String ch, int num){
      this.ch = ch;
      this.num = num;
    }
    Card(Card card){
      this.ch = card.ch;
      this.num = card.num;
    }
  }

  static void trace(Card[] cards){
    for(int i = 0; i < cards.length; i++){
      System.out.print(cards[i].ch + " ");
      System.out.println(cards[i].num);
    }
  }

  static int partition(Card[] cards, int p, int r){
    int x = cards[r].num;
    int i = p-1;
    for(int j = p; j < r; j++){
      if(cards[j].num <= x){
        i++;
        Card tmp = cards[i];
        cards[i] = cards[j];
        cards[j] = tmp;
      }
    }
    Card tmp = cards[i+1];
    cards[i+1] = cards[r];
    cards[r] = tmp;
    return i+1;
  }

  static void quickSort(Card[] cards, int p, int r){
    if(p < r){
      int q = partition(cards, p, r);
      quickSort(cards, p, q-1);
      quickSort(cards, q+1, r);
    }
  }

  static void merge(Card[] a, int left, int mid, int right){
    int n1 = mid - left;
    int n2 = right - mid;
    Card[] L = new Card[n1+1];
    Card[] R = new Card[n2+1];

    for(int i = 0; i < n1; i++)
      L[i] = a[left + i];

    for(int i = 0; i < n2; i++)
      R[i] = a[mid + i];


    L[n1] = new Card();
    R[n2] = new Card();
    L[n1].num = 1000000001;
    R[n2].num = 1000000001;

    int i = 0;
    int j = 0;

    for(int k = left; k < right; k++){
      if(L[i].num <= R[j].num)
        a[k] = L[i++];
      else
        a[k] = R[j++];
    }
  }

  static void mergeSort(Card[] a, int left, int right){
    if(left + 1 < right){
      int mid = (left + right) / 2;
      mergeSort(a, left, mid);
      mergeSort(a, mid, right);
      merge(a, left, mid, right);
    }
  }

  static boolean areSame(Card[] cards1, Card[] cards2, int n){
    int i = 0;
    for(i = 0; i < n; i++){
      if(!cards1[i].ch.equals(cards2[i].ch))
        return false;
      if(cards1[i].num != cards2[i].num)
        return false;
    }
    return true;
  }

  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    int n = stdIn.nextInt();
    Card[] cards = new Card[n];
    for(int i = 0; i < n; i++){
      cards[i] = new Card();
      cards[i].ch = stdIn.next();
      cards[i].num = stdIn.nextInt();
    }
    Card[] cards2 = new Card[n];
    for(int i = 0; i < n; i++)
      cards2[i] = new Card(cards[i]);

    quickSort(cards, 0, cards.length-1);
    mergeSort(cards2, 0, cards.length);

    if(areSame(cards, cards2, n))
      System.out.println("Stable");
    else
      System.out.println("Not stable");

    trace(cards);

  }
}