import java.util.*;
import java.util.stream.IntStream;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
      //n 枚数 r 操作回数
      int n = Integer.parseInt(sc.next());
      int r = Integer.parseInt(sc.next());
      int[] cards = new int[n];
      //cards[0]が一番下
      for(int i = 0; i < n; i++) cards[i] = i + 1;
      if(n == 0 && r == 0) break;
      for(int i = 0; i < r; i++){
        cards = swap(cards, Integer.parseInt(sc.next()), Integer.parseInt(sc.next()), n);
      }
      //for(int v: cards) System.out.printf("%d\n", v);
      System.out.printf("%d\n", cards[n - 1]);
    }
  }

  public static int[] swap(int[] cards, int a, int b, int n){
    int[] cards_1 = new int[n];
    int[] cards_2 = new int[n];
    int[] cards_3 = new int[n];
    cards_1 = Arrays.copyOfRange(cards, n - a + 1, n);
    cards_2 = Arrays.copyOfRange(cards, n - a - b + 1, n - a + 1);
    cards_3 = Arrays.copyOfRange(cards, 0, n - a - b + 1);
    IntStream stream1 = Arrays.stream(cards_1);
    IntStream stream2 = Arrays.stream(cards_2);
    IntStream stream3 = Arrays.stream(cards_3);


    IntStream stream32 = IntStream.concat(stream3, stream1);
    stream32 = IntStream.concat(stream32, stream2);
    return stream32.toArray();
  }
}
