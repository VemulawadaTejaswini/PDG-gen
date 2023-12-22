import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
  
  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s1 = r.readLine();
    String s2 = r.readLine();
    String s3 = r.readLine();
    
    System.out.print(s1.charAt(0));
    System.out.print(s2.charAt(1));
    System.out.print(s3.charAt(2));
  }
  
}