import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner input=new Scanner(System.in);
    while(true)
    { int a=input.nextInt();
    String op=input.next();
    int b=input.nextInt();
    if(op.equals("?"))
      break;
    else if(op.equals("+"))
      System.out.println(a+b);
    else if(op.equals("-"))
      System.out.println(a-b);
    else if(op.equals("*"))
      System.out.println(a*b);
    else if(op.equals("/"))
      System.out.println(a/b);
    }
}
}
