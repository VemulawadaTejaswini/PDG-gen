import java.util.Scanner;
class Main {

  public static String getParent(int i, int[] h) {
    if (i == 1)
      return "";
    return "parent key = " + h[(int) (i / 2) - 1] + ", ";
  }

  public static String getLeft(int i, int[] h) {
    int childIdx = i * 2;
    if (childIdx > h.length)
      return "";
    return "left key = " + h[childIdx - 1] + ", ";
  }

  public static String getRight(int i, int[] h) {
    int childIdx = i * 2 + 1;
    if (childIdx > h.length)
      return "";
    return "right key = " + h[childIdx - 1] + ", ";
  }

  public static void printProperties(int i, int[] h) {
    System.out.print("node " + i + ": ");
    System.out.print("key = " + h[i-1] + ", ");
    System.out.print(getParent(i, h));
    System.out.print(getLeft(i, h));
    System.out.print(getRight(i, h));
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[] h = new int[n];
    for (int i = 0; i < n; i++) {
      h[i] = s.nextInt();
    }
    s.close();
    for (int i = 1; i <= n; i++) {
      printProperties(i, h);
    }
  }
}

