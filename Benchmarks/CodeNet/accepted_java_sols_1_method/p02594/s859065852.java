import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int temprature = Integer.parseInt(scan.nextLine());
    if(temprature>=30) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
