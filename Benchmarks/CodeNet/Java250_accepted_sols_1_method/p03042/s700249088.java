import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    int prefix = Integer.parseInt(s.substring(0, 2));
    int suffix = Integer.parseInt(s.substring(2, 4));

    if (prefix >= 1 && prefix <= 12 && suffix >= 1 && suffix <= 12)
      System.out.println("AMBIGUOUS");
    else if (prefix >= 1 && prefix <= 12)
      System.out.println("MMYY");
    else if (suffix >= 1 && suffix <= 12)
      System.out.println("YYMM");
    else
      System.out.println("NA");
  }
}