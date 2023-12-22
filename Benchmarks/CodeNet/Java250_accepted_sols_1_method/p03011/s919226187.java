import java.util.*;

 
class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    int input2 = scanner.nextInt();
    int input3 = scanner.nextInt();
    scanner.close();
    int a = input + input2;
    int b = input2 + input3;
    int c = input3 + input;
    int alpha = Math.min(a,b);
    int beta = Math.min(alpha,c);
    System.out.println(beta);
  }
}
