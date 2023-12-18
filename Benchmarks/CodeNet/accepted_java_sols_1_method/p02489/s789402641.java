import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n;
    int i = 1;

    while ((n = input.nextInt()) != 0){
      System.out.println("Case " + i++ + ": " + n);
    }
  }
}