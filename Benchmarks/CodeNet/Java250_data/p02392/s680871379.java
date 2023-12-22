import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner a = new Scanner(System.in);
    String input = a.nextLine();
    String[] spt = input.split(" ");
    int num1 = Integer.parseInt(spt[0]);
    int num2 = Integer.parseInt(spt[1]);
    int num3 = Integer.parseInt(spt[2]);
    
    if(num1 < num2 && num2 < num3) 
    {
            System.out.println("Yes");
    }
    else 
    {
            System.out.println("No");
    }
  }
}
