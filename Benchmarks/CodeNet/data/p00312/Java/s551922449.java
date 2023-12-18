import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner sin = new Scanner(System.in);

    int L = sin.nextInt();
    int D = sin.nextInt();

    int result = L / D + L % D;

    System.out.println(result);
  }
}
