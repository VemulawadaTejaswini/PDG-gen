import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Integer> a = new ArrayList<Integer>();
    while (scanner.hasNext()) {
      a.add(scanner.nextInt());
    }
    Collections.sort(a);
    Collections.reverse(a);
    String out = "";
    for (int ii = 0; ii < a.size(); ii++) {
      out += a.get(ii) + " ";
    }
    System.out.println(out.trim());
  }
}