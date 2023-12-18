import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    int n = Integer.parseInt(str);
    str = scan.nextLine();
    int count = (int)str.chars().filter(ch -> ch == 'R').count();
    long countLeft = (int)str.substring(0,count).chars().filter(ch -> ch == 'R').count();


    System.out.println(count-countLeft);
  }
}