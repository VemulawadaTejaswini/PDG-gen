import java.io.*;

class Main
{
  public static void main(String args[])
  {
    int num;
    String buf;
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      buf = br.readLine();
      num = Integer.parseInt(buf);
      System.out.println(num * num * num);
    } catch(Exception e) {}
  }
}