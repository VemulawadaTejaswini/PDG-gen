import java.util.*;
import static java.lang.System.*;
class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(in)) {
      out.println(sc.nextInt() >= 30 ? "Yes" : "No");
    }
  }
}