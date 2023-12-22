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
    for (int i = 0; i < Slist.size() - 1; i++) {
      String chunk = Slist.get(i).toString() + Slist.get(i + 1).toString();

      if (chunk.equals("10") || chunk.equals("01")) {
        count += 2;
        Slist.remove(i);
        Slist.remove(i);
        // System.out.println(Slist);
        i -= 2;

        if (i < -1) {
          i = -1;
        }
      }

    }

    System.out.println(count);
  }

}
