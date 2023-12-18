import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int sc = new Scanner(System.in).nextInt();

    int s = sc%60;
    int m = sc/60%60;
    int h = sc/60/60;

    System.out.println( h + ":" + m + ":" + s);

  }
}
