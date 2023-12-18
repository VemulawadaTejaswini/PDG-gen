import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Double> ms = new ArrayList<Double>();
    while (scanner.hasNext()) {
      ms.add(scanner.nextDouble());
    }
    Collections.sort(ms);
    System.out.println(ms.get(ms.size() - 1) - ms.get(0));
  }
}