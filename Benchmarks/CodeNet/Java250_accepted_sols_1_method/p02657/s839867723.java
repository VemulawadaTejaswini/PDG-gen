import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int totalnum = Integer.parseInt(sc.next());
      int al = Integer.parseInt(sc.next());
      
      System.out.println(totalnum * al);
    }
  }
}