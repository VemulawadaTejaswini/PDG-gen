import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int menseki = 0;
    int syu = 0;
    menseki =  a * b;
    syu = 2*(a+b);
    System.out.println(a +" "+ b);
    
    System.out.println(menseki +" "+ syu);
   }
}
    