import java.util.Scanner;

public class Main {
  public static void main(final String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();

    int o = -1;
    for (int i = 1;i< (int)(100/0.08)+1;i++) {
      if ((int)(i*0.08)== a && (int)(i*0.1) == b) {
        o = i;
        break;
      }
    }

    System.out.println(o);
  }
}