import java.lang.Integer;
import java.lang.String;
import java.io.*;

public class Main{
  public static void main(String args[]) throws IOException{

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = new String(in.readLine());

    String[] li = s.split(" +");

    int A = Integer.parseInt(li[0]);
    int B = Integer.parseInt(li[1]);
    int C = Integer.parseInt(li[2]);

    int i = 0,j = 7;

    while((A*7 + B)*(i+1) < C)i++;

    while((A*7 + B)*i + A * (j - 1) >= C)j--;
    System.out.println(i*7 + j);


  }
}
