import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Integer e = Integer.parseInt(sc.next());

    while (!e.equals(0)) {
      List<Integer> candidates = new ArrayList<>();
      Integer max_z = new Double(Math.cbrt(e)).intValue();
      for(int z = max_z; z >= 0; z--) {
        Integer zzz = z*z*z;
        Integer y = new Double(Math.sqrt(e - zzz)).intValue();
        Integer x = e - zzz - y*y;
        candidates.add(x+y+z);
      }
      System.out.println(candidates.stream().sorted().findFirst().get());
      e = Integer.parseInt(sc.next());
    }
  }
}

