import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    
    A = A + B + C;
    B = A - (B + C);
    C = A - (B + C);
    A = A - (B + C);
    System.out.println(A);
    System.out.println(B);
    System.out.println(C);
  }
}
