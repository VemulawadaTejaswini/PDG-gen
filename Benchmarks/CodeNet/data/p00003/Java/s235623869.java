public class Main
{
  public static void main(String[]args)
  {
    java.util.Scanner take = new java.util.Scanner(System.in);
    int c = take.nextInt();
    boolean []b = new boolean[c];
    for(int i = 0;i<c;i++)
    {
      int []t = new int[3];
      for(int j = 0;j<t.length;j++)
      {
        t[j] = take.nextInt();
      }
      if(t[0]*t[0]+t[1]*t[1] == t[2]*t[2])
      {
        b[i] = true;
      }
      else
      {
        b[i] = false;
      }
    }
    for(int i = 0;i<b.length;i++)
    {
      if(b[i])
      {
        System.out.println("YES");
      }
      else
      {
        System.out.println("NO");
      }
    }
  }
}