import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int n = scan.nextInt();
    int a = scan.nextInt();
    int b = scan.nextInt();
    
    int x = a * n;
    
    if (x > b) {
    	System.out.print(b);
    } else {
    	System.out.print(x);
    }
  }
}
