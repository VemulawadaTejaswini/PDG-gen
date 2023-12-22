import java.io.*;

public class Main {
  
  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s = r.readLine();
    String sl[] = s.split(" ");
    int a = Integer.parseInt(sl[0]);
    int b = Integer.parseInt(sl[1]);
    int v = 0;
    for(int i = a; i <= b; i++)
    {
      if(i % 10 == i / 10000 && i / 10 % 10 == i / 1000 % 10)
      {
        v++;
      }
    }
    System.out.println(v);
  }
}

