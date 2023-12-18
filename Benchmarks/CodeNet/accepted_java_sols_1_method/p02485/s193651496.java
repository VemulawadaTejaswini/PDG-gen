import java.io.*;

public class Main
{
  public static void main(String[] args)
  {
    BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
    try
    {
      while(true)
      {
        String num=reader.readLine();
        if(Character.getNumericValue(num.charAt(0))==0)
        {
          break;
        }
        int len=num.length();
        int sum=0;
        for(int i=0;i<len;i++)
        {
          char n=num.charAt(i);
          int suu=Character.getNumericValue(n);
          sum+=suu;
        }
        System.out.printf("%d\n",sum);
      }
    }
    catch(IOException e)
    {
      System.out.println(e);
    }
  }
}