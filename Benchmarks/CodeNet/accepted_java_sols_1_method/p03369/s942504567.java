import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int p = 700;
    for (String ss: s.split("")) {
      if (ss.equals("o")) p += 100;
    }
    System.out.println(p);
  }
}
