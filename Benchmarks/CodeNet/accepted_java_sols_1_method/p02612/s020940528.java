import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String read = scan.nextLine();
    int N = Integer.parseInt(read);
    int R = N % 1000;
    
    if (R == 0) {
      System.out.println(0);
    }
    else {
      System.out.println(1000 - R);
    }
  }
}
