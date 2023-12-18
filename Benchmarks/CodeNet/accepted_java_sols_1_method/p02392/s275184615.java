import java.util.Scanner;
class Main {
  public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
  int a = scanner.nextInt();
  int b = scanner.nextInt();
  int c = scanner.nextInt();
  boolean range = a < b && b < c;
  if(range){
      System.out.println("Yes");
  } else {
      System.out.println("No");
  }
  }
}