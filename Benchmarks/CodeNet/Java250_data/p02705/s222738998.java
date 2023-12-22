import java.util.*;
import java.io.*;
public class Main
{
  public static void main(String args[])throws Exception
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw=new PrintWriter(System.out);
    int r=Integer.parseInt(br.readLine());
    pw.println(Math.PI*r*2);
    pw.flush();
    pw.close();
  }
}