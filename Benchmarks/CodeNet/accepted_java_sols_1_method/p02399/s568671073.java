import java.io.*;
import java.text.DecimalFormat;

class Main
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split(" ",0);
    int a = Integer.parseInt(str[0]);
    int b = Integer.parseInt(str[1]);

    int d = a / b;
    int r = a % b;
    double f = (double)a/b;

    DecimalFormat df = new DecimalFormat("0.00000000");
    System.out.println(d + " " + r + " " + df.format(f));
  }
}