import java.util.*;

public class Main {

  public static void main(String[] args) {
    Tramp tramp = new Tramp();
    try (Scanner scanner = new Scanner(System.in)) {
      int n = scanner.nextInt();
      for (int i = 0; i < n; i++) {
        tramp.appendFoundedCard(scanner.next(), scanner.nextInt());
      }
    }
    System.out.print(tramp);
  }
}

class Tramp {
  final Map<String, List<Boolean>> cards;

  Tramp() {
    cards = new HashMap<>();
    cards.put("S", new ArrayList<>());
    cards.put("H", new ArrayList<>());
    cards.put("C", new ArrayList<>());
    cards.put("D", new ArrayList<>());

    for (int i = 0; i < 13; i++) {
      cards.get("S").add(false);
      cards.get("H").add(false);
      cards.get("C").add(false);
      cards.get("D").add(false);
    }
  }

  void appendFoundedCard(String type, int number) {
    cards.get(type).set(number - 1, true);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    String[] strings = {"S", "H", "C", "D"};
    Arrays.stream(strings).forEach(it -> {
      for (int i = 0; i < cards.get(it).size(); i++) {
        boolean hasCard = cards.get(it).get(i);
        if (hasCard) {
          continue;
        }
        builder.append(String.format("%s %d\n", it, i + 1));
      }
    });
    return builder.toString();
  }
}