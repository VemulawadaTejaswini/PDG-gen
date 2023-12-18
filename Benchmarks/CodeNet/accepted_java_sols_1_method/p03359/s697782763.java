import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int a = Integer.parseInt(scanner.next());
    int b = Integer.parseInt(scanner.next());
    int count = a <= b ? a : a - 1;
    System.out.println(count);
    scanner.close();
  }
}