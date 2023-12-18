import java.io.*;
class prg
{
  public static void main(STring args[])throws IOException
  {
    int i;
    char ch;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    ch=(char)br.read();
    if(ch>='A' && ch<='Z')
    {
      System.out.println("A");
    }
    else if(ch>='a' && ch<='z')
    {
      System.out.println("a");
    }
  }
}