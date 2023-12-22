import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner sin = new Scanner(System.in);

    int a = sin.nextInt();
    int b = sin.nextInt();
    int c = sin.nextInt();

    if ( a < b && b < c) { System.out.println("Yes"); }
    else { System.out.println("No"); }
  }
}
