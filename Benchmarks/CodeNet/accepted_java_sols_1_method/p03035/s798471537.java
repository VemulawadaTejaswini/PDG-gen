import java.util.Scanner;
 
class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    
    if (x <= 5){
      System.out.print(0);
    }else if (x <= 12){
      System.out.print(y/2);
    }else{
      System.out.print(y);
    }
  }
}