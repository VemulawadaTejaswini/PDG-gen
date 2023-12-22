import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int r = scan.nextInt();
    int D = scan.nextInt();
    int x_2000 = scan.nextInt();
    
    for (int i = 0; i < 10; i++) {
      x_2000 = r * x_2000 - D;
      System.out.println(x_2000);
    }
  }
}