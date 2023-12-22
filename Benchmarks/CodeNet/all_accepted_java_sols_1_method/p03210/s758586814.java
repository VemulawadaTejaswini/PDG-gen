import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    System.out.println(age == 3 || age == 5 || age == 7 ? "YES" : "NO");
  }

}
