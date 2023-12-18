import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    int n = sc.nextInt();
    int [] lots = new int[w];
    for (int i = 0; i < w; i++) lots[i] = i + 1;

    for (int i = 0; i < n; i++) {
      String [] s = sc.next().split(",");
      int a = Integer.parseInt(s[0]);
      int b = Integer.parseInt(s[1]);
      int temp;

      temp = lots[a - 1];
      lots[a - 1] = lots[b - 1];
      lots[b - 1] = temp;
    }

    for (int i = 0; i < w; i++) {
      System.out.println(lots[i]);
    }
  }
}