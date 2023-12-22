import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    String W = sc.nextLine().trim();
    while (true) {
      String[] T = sc.nextLine().split(" ");
      if (T[0].equals("END_OF_TEXT"))
        break;
      for (int i = 0; i < T.length; i++) {
        if (T[i].equalsIgnoreCase(W))
          count++;
      }
    }
    System.out.println(count);
    sc.close();
  }
}
