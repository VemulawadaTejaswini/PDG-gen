import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner input=new Scanner(System.in);
    String a=input.next();
    a=a.toUpperCase();
    int list[]=new int[26];
    for(int i=0;i<a.length();i++)
    {
      int temp=a.codePointAt(i);
      list[temp-65]=1;
    }
    int test=0;
    for(int i=0;i<list.length;i++)
    {
      int c=list[i];
      if(c==1)
      {
        char d=(char)(i+65);
        int count=0;
        for(int k=0;k<a.length();k++)
        {
          char f=a.charAt(k);
          if(f==d)
          {
            count++;
          }
        }
        if(count%2!=0)
        {
          test=1;
          break;
        }
      }
    }
    if(test==0)
    {
      System.out.println("Yes");
    }else
    System.out.println("No");
  }
}