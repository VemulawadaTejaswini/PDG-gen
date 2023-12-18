import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();

    int rest;
    int t = s / (60 * 60);
    rest = s % (60 * 60);
    int m = (rest) / 60;
    rest = rest % 60;

    System.out.println(t + ":" + m + ":" + rest);
  }
}

