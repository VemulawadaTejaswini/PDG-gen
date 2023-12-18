import java.util.Scanner;
 
class Main
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x;
    for(int i = 1 ; (x = sc.nextInt()) != 0 ; i++)
    {
      System.out.println("Case "+ i +": "+ x);
    }
  }
}