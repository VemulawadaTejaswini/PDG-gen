import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner input=new Scanner(System.in);
    int a=input.nextInt(),b=input.nextInt(),c=input.nextInt();
    int count=a,lim=b,divc=0;
    while(count<=lim)
    {
      if(c%count==0)
      {
        divc++;
        count++;
      }
      else
        count++;}
    System.out.println(divc);
  }
}
