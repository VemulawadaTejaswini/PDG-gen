import java.util.Scanner;

public class Main {
  public static String[] str = new String[3];

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    str[0] = scn.next();
    str[1] = scn.next();
    str[2] = scn.next();

    int num = 0;

    while(num >= 0) {
      num = play(num);
    }

    num += 3;

    switch (num) {
      case 0:
        System.out.println("A");
        break;
      case 1:
        System.out.println("B");
        break;
      case 2:
        System.out.println("C");
        break;
      default:
        break;
    }
  }

  public static int play(int n) {
    if (str[n].length() == 0) {
      return n-3;
    }

    char nextPlayer = str[n].charAt(0);

    str[n] = str[n].substring(1, str[n].length());

    switch (nextPlayer) {
      case 'a':
        n = 0;
        break;
      case 'b':
        n = 1;
        break;
      case 'c':
        n = 2;
        break;
      default:
        break;
    }

    //System.out.printf("A:%s\tB:%s\tC:%s\t%c\t%d\n", str[0], str[1], str[2], nextPlayer, n);

    return n;
  }
}
