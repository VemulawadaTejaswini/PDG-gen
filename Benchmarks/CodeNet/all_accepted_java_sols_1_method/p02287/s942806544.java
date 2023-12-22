import java.util.Scanner;

class Main {
  public static final String NODE = "node ";
  public static final String KEY = ": key = ";
  public static final String COMMA = ", ";
  public static final String PARENT = "parent key = ";
  public static final String LEFT = "left key = ";
  public static final String RIGHT = "right key = ";

  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt() + 1;
    int[] tree = new int[size];
    for (int i = 1; i < size; i++) {
      tree[i] = sc.nextInt();
    }
    int capacity = 100;
    StringBuilder sb = new StringBuilder(capacity);
    for (int i = 1; i < size; i++) {
      sb.append(NODE).append(i).append(KEY).append(tree[i]).append(COMMA);

      if (i != 1) {
        sb.append(PARENT).append(tree[i / 2]).append(COMMA);
      }

      if (i * 2 < size) {
        sb.append(LEFT).append(tree[i * 2]).append(COMMA);
        if (i * 2 + 1 < size) {
          sb.append(RIGHT).append(tree[i * 2 + 1]).append(COMMA);
        }
      }

      System.out.println(sb);
      sb = new StringBuilder(capacity);
    }
  }
}

