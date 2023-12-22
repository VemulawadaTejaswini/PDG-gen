import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner dataScanner = new Scanner(System.in);
    String data = dataScanner.nextLine();
    String[] dataList = data.split(" ");
    int a = Integer.parseInt(dataList[0]);
    int b = Integer.parseInt(dataList[1]);
    if (a*b % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
  } 
}
