
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);
    int age = cin.nextInt();
    int cost = cin.nextInt();

    if (age >= 13) {
      System.out.println(cost);
    }
    else if (age>=6 && age<=12) {
      System.out.println(cost/2);
    }
    else {
      System.out.println(0);
    }
  }

}
