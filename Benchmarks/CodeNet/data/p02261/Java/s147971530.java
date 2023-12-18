import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
  public static void main(String args[] ) throws IOException {
    BufferedReader br = new BufferedReader(new InputStream(System.in));

    int N = Integer.parseInt(br.readLine());
    String[] bCards = br.readLine().split(" ");
    String[] cCards = bCards.clone();

    System.out.println(toStr(bubbleSort(bCards, N)) + "\nStable");
    System.out.println(toStr(selectionSort(cCards, N)));
    System.out.println(Arrays.equals(bCards, cCards) ? "Stable" : "Not stable");
  }

  private static String[] bubbleSort(String[] cards, int N) {
    for (int i=0;i<N;i++) {
      for (int j=N-1;j>i;j--) {
        if(toInt(cards[j]) < toInt(cards[j-1])){
          String tmp = cards[j];
          cards[j] = cards[j-1];
          cards[j-1] = tmp;
        }
      }
    }
    return cards;
  }

  private static String[] selectionSort(String[] cards, int N) {
    for (int i=0;i<N;i++) {
      int minj = i;
      for (int j=i;j<N;j++) {
        if(toInt(cards[j]) < toInt(cards[minj])){
          minj = j;
        }
      }
      String tmp = cards[i];
      cards[i] = cards[minj];
      cards[minj] = tmp;
    }
    return cards;
  }

  private static int toInt(String card) {
    return Integer.parseInt(card.substring(1));    
  }

  private static String toStr(String[] cards) {
    StringBuilder sb = new StringBuilder();
    for (String card : cards) {
      sb.append(card).append(" ");
    }
    return sb.toString().trim();
  }
}