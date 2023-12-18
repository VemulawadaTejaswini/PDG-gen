
import java.util.*;

public class Main {
  public static void main(final String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Card[] arr = new Card[n];
    for (int i = 0; i < n; i++) {
      arr[i] = new Card();
      char[] c = sc.next().toCharArray();
      arr[i].suit = c[0];
      arr[i].value = c[1];
    }
    Card[] arr2 = Arrays.copyOf(arr, n);

    bubbleSort(arr);// always stable
    trace(arr);
    System.out.println("Stable");

    selectionSort(arr2);
    trace(arr2);
    System.out.println(isStable(arr, arr2) ? "Stable" : "Not stable");
  }

  static boolean isStable(Card[] arr, Card[] arr2) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].suit != arr2[i].suit)
        return false;
    }
    return true;
  }

  static int selectionSort(Card[] arr) {
    int cnt = 0, minIdx;
    for (int i = 0; i < arr.length - 1; i++) {
      minIdx = i;
      // 未ソートの部分から最小の要素の位置を特定して
      for (int j = i; j < arr.length; j++) {
        if (arr[j].value < arr[minIdx].value)
          minIdx = j;
      }
      // 交換する
      if (i != minIdx) {
        Card tmp = arr[i];
        arr[i] = arr[minIdx];
        arr[minIdx] = tmp;
        cnt++;
      }
    }
    return cnt;
  }

  static int bubbleSort(Card[] arr) {
    int cnt = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = arr.length - 1; j >= i + 1; j--) {
        if (arr[j].value < arr[j - 1].value) {
          Card tmp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = tmp;
          cnt++;
        }
      }
    }
    return cnt;
  }

  static void trace(Card[] arr) {
    StringBuilder sb = new StringBuilder();
    for (Card c : arr) {
      sb.append(c.toString()).append(' ');
    }
    System.out.println(sb.toString().trim());
  }
}

class Card {
  char suit;
  char value;

  public String toString() {
    return String.valueOf(suit) + value;
  }
}
