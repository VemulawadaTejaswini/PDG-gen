import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int N = scan.nextInt();
    scan.nextLine();
    String s = scan.nextLine();
    String[] result = s.split("B");
    int count = 0;
    for (String ss : result) {
      count += ss.length();
    }
    System.out.println(count > N / 2 ? "Yes" : "No");
  }
}
