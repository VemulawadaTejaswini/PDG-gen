import java.util.Scanner;
class Main
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String s = sc.nextLine();
    if(n<3200)
    {
      System.out.println("red");
      
    }else
    {
      System.out.println(s);
    }

    
  }
}

