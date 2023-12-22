
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    int a = cin.nextInt();
    int b = cin.nextInt();

    if (a <= b && b % a == 0) {
      System.out.println(b + a);
    } else {
      System.out.println(b - a);
    }

  }

}