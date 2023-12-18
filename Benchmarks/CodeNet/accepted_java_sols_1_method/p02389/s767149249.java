import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int w = sc.nextInt();
    int h = sc.nextInt();

    System.out.printf("%d %d\n", w*h ,2*(w+h));
  }
}

