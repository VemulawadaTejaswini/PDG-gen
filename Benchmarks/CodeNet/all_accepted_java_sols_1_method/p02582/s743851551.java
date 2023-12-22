import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    int c,i;
    Scanner sc = new Scanner(System.in);
    String s=sc.nextLine();
    c=0;
    String str [] = s.split("S",-1);
    for(i=0;i<str.length;i++)
    {
      if(str[i].length()>c)
      c=str[i].length();
    }
    System.out.println(c);
  }
}