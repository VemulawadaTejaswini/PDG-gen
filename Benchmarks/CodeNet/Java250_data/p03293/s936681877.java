import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String[] myArgs = new String[2];
    Scanner sc = new Scanner(System.in);
    myArgs[0] = sc.next();
    myArgs[1] = sc.next();

    Main logic = new Main();
    String output = logic.exec(myArgs);
    System.out.print(output);
  }
  private String exec(String[] myArgs) {
    final char[] compareTo = myArgs[0].toCharArray();
    char[] compareBy = myArgs[1].toCharArray();
    if (compareBy.length != compareTo.length) {
      return "No";
    }
    for (int i = 0;i < compareBy.length;i++) {
      boolean same = true;
      for (int j = 0;j < compareTo.length;j++) {
        int index = i + j;
        if (index >= compareTo.length) {
          index -= compareTo.length;
        }
        if (compareBy[index] != compareTo[j]) {
          same = false;
        }
      }
      if (same) {
        return "Yes";
      }
    }

    return "No";
  }
}
