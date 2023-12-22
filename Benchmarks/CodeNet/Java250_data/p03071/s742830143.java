import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int A = scan.nextInt();
    int B = scan.nextInt();
    int result = 0;
    
    if (A > B) {
      result += A--;
    } else {
      result += B--;
    }

    if (A > B) {
      result += A;
    } else {
      result += B;
    }
    System.out.println(result);
  }
}
