import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
  
  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String sl[];

    sl = r.readLine().split(" ");
    int n = Integer.parseInt(sl[0]);
    int a = Integer.parseInt(sl[1]);
    int b = Integer.parseInt(sl[2]);
    
    System.out.println(n * a < b ? n * a : b);
    
  }

}
