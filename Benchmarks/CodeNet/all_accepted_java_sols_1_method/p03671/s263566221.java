import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int sum = a;
    int max = a;
    int b = sc.nextInt();
    sum += b;
    max = Math.max(max, b);
    int c = sc.nextInt();
    sum += c;
    max = Math.max(max, c);
    System.out.println(sum - max);

  }
}