import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    String s="";
    while(n!=0)
    {
      int p=(int)n%26 + 96;
      String str =new Character((char)p).toString();
      s=str+s;
      n=n/26;
    }
    System.out.println(s);
  }
}