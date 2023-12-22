import java.util.*;
import java.util.stream.Collectors;

/**
 * ABC043 B
 *
 * @date 2020.08.22
 * @author 焼き鮭 <yaki-shake@up-tri.me>
 */

public class Main {
  Scanner sc;

  public static void main(String[] args) {
    new Main().execute();
  }

  public void execute() {
    this.sc = new Scanner(System.in);
    String commands = this.sc.next();
    String[] keys = commands.split("");
    ArrayList<String> output = new ArrayList<String>();
    for (String key : keys) {
      if (key.equals("B")) {
        if (0 < output.size()) {
          output.remove(output.size() - 1);
        }
      } else {
        output.add(key);
      }
    }

    System.out.println(output.stream().collect(Collectors.joining("")));
  }
}
