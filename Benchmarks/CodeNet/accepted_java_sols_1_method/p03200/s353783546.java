
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);

    String s;
    String sl[];

    int a[] = new int[300000];

    s = r.readLine();
    int n = s.length();
    for(int i = 0; i < n; i++)
    {
      a[i] = (s.charAt(i) == 'B' ? 1 : 0);
    }

    for(int i = n - 1; i >= 0; i--)
    {
      if(a[i] == 1)
      {
        n--;
      }
      else
      {
        break;
      }
    }

    if(n <= 1)
    {
      System.out.println(0);
      System.exit(0);
    }

    long z = 0;
    for(int i = n - 2; i >= 0; i--)
    {
      if(a[i] == 1)
      {
        //System.out.println(n - i - 1);
        z += n - i - 1;
        n--;
      }
    }

    System.out.println(z);

  }

}