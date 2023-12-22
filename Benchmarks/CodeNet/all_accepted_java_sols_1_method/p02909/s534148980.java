import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    List<String> w = new ArrayList<>(Arrays.asList("Sunny", "Cloudy", "Rainy"));
    String s = scan.next();
    int index = (w.indexOf(s) + 1) % 3;
    System.out.println(w.get(index));
    scan.close();
  }
}
