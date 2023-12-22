import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int five_hundreds = n / 500;
    n -= five_hundreds * 500;
    System.out.println(five_hundreds * 1000 + n/5 * 5);
  }
}