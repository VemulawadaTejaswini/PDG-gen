import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner input=new Scanner(System.in);
    int W=input.nextInt();
    int H=input.nextInt();
    int x=input.nextInt();
    int y=input.nextInt();
    int r=input.nextInt();
    
    if(r<=H/2)
    {
      if(x>=r && x<=W-r && y>=r && y<=H-r)
        System.out.println("Yes");
    else
     System.out.println("No");}
    else 
      System.out.println("No");}

}
