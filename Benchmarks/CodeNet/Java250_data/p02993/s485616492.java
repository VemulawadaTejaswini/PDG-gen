import java.util.Scanner;

/**
 * @author author
 *
 */
public class Main {

  public static void main(String argus[]) {

    Scanner sc = new Scanner(System.in);
    String[] number = sc.next().split("");
   
    for (int i = 0; i < number.length - 1; i++) {
      if (number[i].equals(number[i + 1])) {
        System.out.println("Bad");
        return;
      }
    }
    
    System.out.println("Good");
  }
}
