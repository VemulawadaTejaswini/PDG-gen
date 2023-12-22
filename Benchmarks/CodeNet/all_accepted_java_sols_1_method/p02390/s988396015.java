import java.util.Scanner;

public class Main {
  public static void main(String[] arg) {
    Scanner sc = new Scanner(System.in);
    int inputSec = sc.nextInt();
    sc.close();
    int h = inputSec / 60 / 60;
    int m = inputSec / 60 % 60;
    int s = inputSec % 60;
    System.out.println(h + ":" + m + ":" + s);
  }
}

