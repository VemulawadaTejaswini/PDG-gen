import java.util.Scanner;

public class Main {

  /*
    input: 3 5
    output: 15 16
  */

  public static void main(String[] args) {
    // https://stackoverflow.com/questions/27880245/reading-input-delimited-by-spaces-in-java
    Scanner scan = new Scanner(System.in);
    int w = scan.nextInt();
    int h = scan.nextInt();
    System.out.printf("%d %d\n", w*h, 2*(w+h));
  }
}
