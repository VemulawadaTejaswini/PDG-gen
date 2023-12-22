import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int is = scan.nextInt();
    
    System.out.println((double)is * 2 * Math.PI);
    scan.close();
  }
}