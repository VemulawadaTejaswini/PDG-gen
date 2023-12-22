import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    scan.close();

    int x, y;
    if(a > b) {
      x = b;
      y = a;
    }
    else if(a == b) {
      x = a;
      y = a;
    }
    else {
      x = a;
      y = b;
    }

    for(int i=0; i<y; i++) {
      System.out.print(x);
    }
    System.out.println();
  }
}