import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    HashMap<Integer, Integer> card = new HashMap<Integer, Integer>();
    for(int i = 0; i < N; i++) {
      int a = sc.nextInt();
      if(card.containsKey(a)) {
        card.put(a, card.get(a) + 1);
      } else {
        card.put(a, 1);
      }
    }
    int even = 0;
    for(int key : card.keySet()) {
      if(card.get(key) % 2 == 0) even++;
    }
    if(even % 2 == 0) {
      System.out.println(card.size());
    } else {
      System.out.println(card.size() - 1);
    }
  }
}