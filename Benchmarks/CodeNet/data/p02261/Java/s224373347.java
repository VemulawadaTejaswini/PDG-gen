import java.util.Scanner;

class Card {
  char suit;
  int value;
}


public class Main {
  static void bubbleSort(Card[] a, int n) {
    boolean flag = true;
    for (int i = 0; flag; i ++) {
      flag = false;
      for (int j = n - 1; j >= i + 1; j--) {
        if (a[j].value < a[j-1].value) {
          Card t = a[j];
          a[j] = a[j-1];
          a[j-1] = t;
          flag = true;
        }
      }
    }
  }

  static void selectionSort(Card[] a, int n) {
    for (int i = 0; i < n; i++) {
      int minj = i;
      for (int j = i; j < n; j++) 
        if (a[j].value < a[minj].value) 
          minj = j;
      Card t = a[i];
      a[i] = a[minj];
      a[minj] = t;
    }
  }

  static boolean isStable(Card[] c1, Card[] c2, int n) {
    for (int i = 0; i < n; i++) 
      if (c1[i].suit != c2[i].suit) return false;
    return true;
  }

  static void print(Card[] a, int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(a[i].suit);
      System.out.print(a[i].value);
      if (i != n - 1) System.out.print(' ');
      else System.out.println();
    }
  }
  
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    Card[] c1 = new Card[n];
    Card[] c2 = new Card[n];
    String[] s = new String[n];
    for (int i = 0; i < n; i++) {
      c1[i] = new Card();
      c2[i] = new Card();
      s[i] = stdIn.next();
      c1[i].suit = s[i].charAt(0);
      c1[i].value = Integer.parseInt(s[i].substring(1,2));
      c2[i] = c1[i];
    }
  bubbleSort(c1, n);
  selectionSort(c2, n);
  print(c1, n);
  System.out.println("Stable");
  print(c2, n);
  if (isStable(c1, c2, n)) System.out.println("Stable");
  else System.out.println("Not stable");
  }
}