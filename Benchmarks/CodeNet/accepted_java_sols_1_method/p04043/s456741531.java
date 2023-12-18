import java.util.Scanner;

class Main
{
  public static void main(String args[])
  {
    Scanner scanner = new Scanner(System.in);
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int C = scanner.nextInt();
    if(A==7&&B==5&&C==5||A==5&&B==7&&C==5||A==5&&B==5&&C==7)
    {
      System.out.println("YES");
    }
    else
    {
      System.out.println("NO");
    }
  }
}