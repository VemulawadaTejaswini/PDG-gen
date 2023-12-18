
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    int n = cin.nextInt();
    double sum = 0;

    for (int i = 0; i < n; i++) {
      double value = cin.nextDouble();
      String type = cin.nextLine();
//      System.out.println(value);
//      System.out.println(type);
//      System.out.println(value*380000.0);
      if (type.contains("JPY") ) {
        sum += value;
      } else if (type.contains("BTC")){
        sum += value * 380000.0;
      }
    }
    System.out.println(sum);

  }

}
