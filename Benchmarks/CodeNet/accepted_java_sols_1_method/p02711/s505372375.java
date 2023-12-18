import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    
    String num = stdIn.next();
    if (num.contains("7")) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
