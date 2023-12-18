import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import java.lang.StringBuilder;

public class Main {
  public static void main(String[] args ){

    Scanner sc = new Scanner(System.in);
    String b = sc.next();
    List<Character> enki = new ArrayList<Character>();
    List<Character> revEnki = new ArrayList<Character>();
    enki.add('A');
    enki.add('C');
    enki.add('G');
    enki.add('T');

    revEnki.add('T');
    revEnki.add('G');
    revEnki.add('C');
    revEnki.add('A');

    Character result = revEnki.get(enki.indexOf(b.charAt(0)));
    System.out.println(result);

  }
}
