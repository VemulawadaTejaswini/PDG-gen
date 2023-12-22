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

    int c[][] = new int[3][3];

    for(int i = 0; i < 3; i++)
    {
      sl = r.readLine().split(" ");
      for(int j = 0; j < 3; j++)
      {
        c[i][j] = Integer.parseInt(sl[j]);
      }
    }

    int a[] = new int[3];
    int b[] = new int[3];

    boolean f = true;

    for(int i = 0; i < 2; i++)
    {
      int z = c[i][0] - c[i + 1][0];
      for(int j = 0; j < 3; j++)
      {
        if(c[i][j] - c[i + 1][j] != z)
        {
          //System.out.printf("%d %d\n", i, j);
          f = false;
        }
      }
    }

    for(int i = 0; i < 2; i++)
    {
      int z = c[0][i] - c[0][i + 1];
      for(int j = 0; j < 3; j++)
      {
        if(c[j][i] - c[j][i + 1] != z)
        {
          //System.out.printf("%d %d\n", i, j);
          f = false;
        }
      }
    }

    System.out.println(f ? "Yes" : "No");


  }

}