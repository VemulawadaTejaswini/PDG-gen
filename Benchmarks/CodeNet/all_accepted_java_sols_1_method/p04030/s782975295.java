import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String ss = sc.nextLine();
    StringBuilder sb = new StringBuilder();
    int j = 0;
    for (int i = 0; i < ss.length(); ++i) {
      switch (ss.charAt(i)) {
        case '1':
          sb.append("1");
          ++j;
          break;
        case '0':
          sb.append("0");
          ++j;
          break;
        case 'B':
          if (j > 0) {
            sb.delete(j - 1, j);
            --j;
          }
      }
    }
    System.out.println(sb.toString());
  }
}
