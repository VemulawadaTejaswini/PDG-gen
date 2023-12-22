import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(sc.next().replace("1", "A").replace("9", "1").replace("A", "9"));
  }
}
