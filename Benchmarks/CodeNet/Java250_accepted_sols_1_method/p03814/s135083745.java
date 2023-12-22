import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int a_idx = s.indexOf("A");
    int z_idx = s.lastIndexOf("Z");
    System.out.println(z_idx - a_idx + 1);
  }
}