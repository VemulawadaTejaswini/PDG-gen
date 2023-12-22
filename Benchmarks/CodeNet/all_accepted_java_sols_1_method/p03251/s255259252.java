import java.util.*;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int xn = sc.nextInt();
    int yn = sc.nextInt();
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int x[] = new int [xn];
    int y[] = new int [yn];
    for (int i = 0; i < xn; i++) {
      x[i] = sc.nextInt();
    }
    for (int i = 0; i < yn; i++) {
      y[i] = sc.nextInt();
    }
    Arrays.sort(x);
    Arrays.sort(y);
    if (x[xn-1] < y[0] && X < y[0] && x[xn-1] < Y) {
      System.out.println("No War");
    }
    else
      System.out.println("War");
    }
}
