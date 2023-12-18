import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main
{
  private static BufferedReader buf;
  private static int N;
  private static int ans = 1;
  private static String[] lights;

  private static void initialize() throws IOException
  {
    buf = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(buf.readLine());
    lights = buf.readLine().split(" ", -1);
  }

  private static int search(String[] str)
  {
    int k = 1;
    int tmp = 1;
    for (int i = 0; i < N; i++)
    {
      k = 1;
      for (int j = i+1; j < N; j++)
      {
        if (!(str[j-1].equals(str[j])))
        {
          k++;
          if (tmp < k)
          {
            tmp = k;
            if (tmp == 8) {
              return tmp;
            }
          }
        } else {
          k = 1;
        }
      }
    }
    return tmp;
  }

  private static void search2()
  {
    int ret = 1;
    for (int i = 0; i < N; i++)
    {
      for (int j = i+1; j < N-1; j++)
      {
        if (lights[j-1].equals(lights[j]) && lights[j].equals(lights[j+1]))
        {
          String[] str = new String[N];
          for (int k = 0; k < N; k++) str[k] = lights[k];
          if (lights[j].equals("0")) {
            str[j] = "1";
          } else {
            str[j] = "0";
          }
          ret = search(str);
          if (ans < ret) {
            ans = ret;
            if (ans == 8) {
              return;
            }
          }
        }
      }
    }
  }

  private static void search3()
  {
    int ret = 1;
    int c;
    for (int i = 0; i < N; i++) {
      c = -1;
      for (int j = i+1; j < N; j++) {
        if (lights[j].equals(lights[j-1])) {
          c = j;
        }
        if (c != -1) {
          String[] str = new String[N];
          for (int k = 0; k < N; k++) str[k] = lights[k];
          for (int z = c; z < j+1; z++) {
            if (str[z].equals("1")) {
              str[z] = "0";
            } else {
              str[z] = "1";
            }
            ret = search(str);
            if (ans < ret) {
              ans = ret;
              if (ans == 8) {
                return;
              }
            }
          }
        }
      }
    }
  }

  public static void main(String[] args) throws IOException
  {
    initialize();
    ans = search(lights);
    search2();
    search3();
    System.out.println(ans);
  }
}