import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    a();
  }

  public static void a() {
    try (Scanner sc = new Scanner(System.in)) {

      char al = sc.next().charAt(0);
      if (Character.isUpperCase(al)) {
        System.out.println("A");
      } else {
        System.out.println("a");
      }

    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }
}