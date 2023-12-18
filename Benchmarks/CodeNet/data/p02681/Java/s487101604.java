import java.io*;
class Registration
{
  public static void main(String args[])throws IOException
  {
    InputStreamReader ab = new InputStreamReader(System.in);
    BufferedReader cd = new BufferedReader(ab);
    String s = cd.readLine();
    String t = cd.readLine();
    int l1 = s.length();
    int l2= t.length();
    if(l2>l1)
      System.out.println("No");
    else
    {
      for(int i =0;i<l1;i++)
      {
        if (t.charAt(i) != s.charAt(i))
        {
          System.out.println("No");
          break;
        }
      }
      System.out.println("Yes");
    }}