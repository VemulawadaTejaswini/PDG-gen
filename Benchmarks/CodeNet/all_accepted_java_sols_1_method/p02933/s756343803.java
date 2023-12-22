import java.util.Scanner;
public class Main {
  public static void main(String... args) {
    Scanner scan = new Scanner(System.in);
    int in1 = scan.nextInt();
    System.out.println(in1 >= 3200 ? scan.next() : "red");
  }
}