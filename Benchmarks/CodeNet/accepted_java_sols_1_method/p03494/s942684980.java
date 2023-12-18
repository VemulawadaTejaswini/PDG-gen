import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int b = 0;
    for(int cnt = 0; cnt < n; cnt++){
      b |= sc.nextInt();
    }
    System.out.println(Integer.numberOfTrailingZeros(b));
    sc.close();
  }
}