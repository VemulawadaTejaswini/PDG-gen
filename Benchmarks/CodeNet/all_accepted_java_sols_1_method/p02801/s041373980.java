import java.util.Scanner;
class Main
{
  public static void main(String[] atry)
  {
    Scanner sc=new Scanner(System.in);
    char ch=sc.next().charAt(0);
    int i=(int)ch;
    i++;
    System.out.println((char)i);
  }
}