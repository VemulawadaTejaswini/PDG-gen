import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    char[] S = scn.nextLine().toCharArray();
    ArrayList<Character> Slist = new ArrayList<>();
    for (Character ch : S) {
      Slist.add(ch);
    }

    int count = 0;
    int i = 0;
    while (i < Slist.size() - 1) {
      String chunk = Slist.get(i).toString() + Slist.get(i + 1).toString();

      if (chunk.equals("10") || chunk.equals("01")) {
        count += 2;
        Slist.remove(i);
        Slist.remove(i);
        i = (i - 1 < 0) ? 0 : --i;
      } else {
        i++;
      }

    }

    System.out.println(count);
  }

}
