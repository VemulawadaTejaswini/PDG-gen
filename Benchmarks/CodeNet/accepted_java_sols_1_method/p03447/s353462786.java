import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int wallet = sc.nextInt();
    int cake = sc.nextInt();
    int donut = sc.nextInt();

    int change = (wallet - cake) % donut;

    System.out.println(change);

  }
}