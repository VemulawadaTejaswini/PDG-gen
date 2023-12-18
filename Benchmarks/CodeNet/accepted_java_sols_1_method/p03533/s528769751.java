import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println(new Scanner(System.in).next().matches("AKIHABARA".replaceAll("A", "A?")) ? "YES" : "NO");
  }
}