import java.util.Scanner;
  
class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int x = Integer.parseInt(scanner.nextLine());
    System.out.println(x*x*x);
    scanner.close();
  }
}
