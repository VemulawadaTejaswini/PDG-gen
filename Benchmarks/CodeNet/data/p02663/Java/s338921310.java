import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int answer = 0;
    int h1 = sc.nextInt();
    int m1 = sc.nextInt();
    int h2 = sc.nextInt();
    int m2 = sc.nextInt();
    int k = sc.nextInt();
    int minute1 = (h1 * 60) + m1;
    int minute2 = (h2 * 60) + m2;
    if (minute2 > minute1) {
      answer = minute2 - minute1 - k;
    } else {
      answer = (24 * 60) + minute2 - minute1 - k;
    }
    System.out.println(answer);
  }
}