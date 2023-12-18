import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String[] input = in.nextLine().split(" ");
    
    System.out.println(gcd(Integer.parseInt(input[0]), Integer.parseInt(input[1])));
  }
  
  public static int gcd(int x, int y) {
    if(y != 0) {
      return gcd(y, x%y);
    } else {
      return x;
    }
  }
}
