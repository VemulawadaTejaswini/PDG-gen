import java.io.*;
import java.util.*;
public class Main
{
  public static void main(String args[])throws IOException
  {
    InputStreamReader read = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(read);
    double r=Double.parseDouble(in.readLine());
    double circum=(double)(2*(Math.PI)*r);
    System.out.println(circum);
  }
}