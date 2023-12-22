public class Main {
  public static void main(String[] args) {
    String N = new java.util.Scanner(System.in).nextLine();
    if (N.charAt(0) == '7' || N.charAt(1) == '7' || N.charAt(2) == '7') {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
