import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int n = sc.nextInt();
    boolean[] line = new boolean[105];
    for (int i = 0; i < n; i++) {
      line[sc.nextInt()] = true;
    }

    int pointerLeft = x;
    int pointerRight = x;
    while (true) {
      if (line[pointerLeft] == false) {
        System.out.println(pointerLeft);
        break;
      } else if (line[pointerRight] == false) {
        System.out.println(pointerRight);
        break;
      }
      pointerLeft--;
      pointerRight++;
    }
  }
}
