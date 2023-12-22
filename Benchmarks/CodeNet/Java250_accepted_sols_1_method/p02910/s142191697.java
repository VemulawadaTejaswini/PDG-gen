import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean result = true;
    char[] cs = sc.next().toCharArray();
    for (int i = 0; i < cs.length; i++)
      if (cs[i] == (i % 2 == 0 ? 'L' : 'R'))
        result = false;
    System.out.println(result ? "Yes" : "No");
  }
}