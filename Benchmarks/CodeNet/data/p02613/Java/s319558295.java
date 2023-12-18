import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.nextInt();
    List<String> inputs = new ArrayList<>();

    while (sc.hasNext()) {
      inputs.add(sc.next());
    }
    sc.close();

    long ac = inputs.stream()
    .filter(s -> s.equals("AC"))
    .count();

    long wa = inputs.stream()
    .filter(s -> s.equals("WA"))
    .count();

    long tle = inputs.stream()
    .filter(s -> s.equals("TLE"))
    .count();
    
    long re = inputs.stream()
    .filter(s -> s.equals("RE"))
    .count();

    System.out.print("AC x ");
    System.out.println(ac);

    System.out.print("WA x ");
    System.out.println(wa);

    System.out.print("TLE x ");
    System.out.println(tle);

    System.out.print("RE x ");
    System.out.println(re);
  }
}